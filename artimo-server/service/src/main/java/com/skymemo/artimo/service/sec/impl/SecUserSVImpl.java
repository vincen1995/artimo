package com.skymemo.artimo.service.sec.impl;

import com.skymemo.artimo.dao.sec.SecUserMapper;
import com.skymemo.artimo.entity.sec.SecUser;
import com.skymemo.artimo.entity.sec.SecUserExample;
import com.skymemo.artimo.service.sec.ISecUserSV;
import com.skymemo.artimo.service.sec.dto.UserConst;
import com.skymemo.artimo.service.sec.dto.UserQuery;
import com.skymemo.common.exception.ErrorCode;
import com.skymemo.common.exception.ExceptionHelper;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "iSecUserSV")
public class SecUserSVImpl implements ISecUserSV {

    @Resource
    private SecUserMapper secUserMapper;

    /**
     * @deprecated 此方法会暴露password
     */
    @Override
    @Deprecated
    public List<SecUser> listUserBaseInfo(UserQuery query) throws Exception {
        SecUserExample example = new SecUserExample();
        SecUserExample.Criteria criteria = example.createCriteria();

        if (StringUtils.isNotBlank(query.getUsername())) {
            criteria.andUsernameEqualTo(query.getUsername());
        }
        if (StringUtils.isNotBlank(query.getPassword())) {
            criteria.andPasswordEqualTo(query.getPassword());
        }
        if (StringUtils.isNotBlank(query.getState())) {
            criteria.andStateEqualTo(query.getState());
        } else {
            criteria.andStateEqualTo(UserConst.STATE_NORMAL);
        }

        return secUserMapper.selectByExample(example);
    }

    @Override
    public SecUser getUserByUsernameAndPassword(String username, String password) throws Exception {
        if (StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
            return null;
        }

        UserQuery query = new UserQuery();
        query.setUsername(username);
        query.setPassword(password);
        query.setState(UserConst.STATE_NORMAL);
        List<SecUser> userList = listUserBaseInfo(query);

        SecUser user = null;
        if (userList != null && userList.size() == 1) {
            user = userList.get(0);
            user.setPassword(null);
        } else if (userList != null && userList.size() > 1) {
            ExceptionHelper.throwException(ErrorCode.MULTI_USER_RECORD_ERROR);
        }

        return user;
    }

}
