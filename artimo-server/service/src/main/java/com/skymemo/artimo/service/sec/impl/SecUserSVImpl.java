package com.skymemo.artimo.service.sec.impl;

import com.skymemo.artimo.dao.sec.SecUserMapper;
import com.skymemo.artimo.dao.sec.ext.SecUserExtMapper;
import com.skymemo.artimo.entity.sec.SecUser;
import com.skymemo.artimo.entity.sec.SecUserExample;
import com.skymemo.artimo.service.sec.ISecUserSV;
import com.skymemo.artimo.service.sec.dto.UserConst;
import com.skymemo.artimo.service.sec.dto.UserDTO;
import com.skymemo.artimo.service.sec.dto.UserQuery;
import com.skymemo.common.exception.ErrorCode;
import com.skymemo.common.exception.ExceptionHelper;
import com.skymemo.common.util.date.DateUtil;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service(value = "iSecUserSV")
public class SecUserSVImpl implements ISecUserSV {

    private static final Logger LOGGER = LoggerFactory.getLogger(SecUserSVImpl.class);

    @Resource
    private SecUserMapper secUserMapper;
    @Resource
    private SecUserExtMapper secUserExtMapper;

    @Override
    public int addUser(SecUser user) throws Exception {
        // 校验用户信息是否已存在
        if (isUserExists(user)) {
            LOGGER.error("SecUserSVImpl.addUser -> 用户信息已存在");
            ExceptionHelper.throwException(ErrorCode.USER_ALREADY_EXISTS);
        }

        // 新增用户信息
        if (StringUtils.isBlank(user.getNickname())) {
            user.setNickname(user.getUsername());
        }
        user.setState(UserConst.STATE_NORMAL);
        user.setUtcCreate(DateUtil.getUTC0Current());
        user.setUtcUpdate(user.getUtcCreate());
        user.setUtcAvailable(user.getUtcCreate());
        secUserMapper.insertSelective(user);
        return 1;
    }

    @Override
    public List<SecUser> listUserBasicInfo(UserQuery query) throws Exception {
        SecUserExample example = new SecUserExample();
        SecUserExample.Criteria criteria = example.createCriteria();

        if (StringUtils.isNotBlank(query.getSearchStr())) {
            criteria.andNicknameLike("%" + query.getSearchStr() + "%");
        }
        if (StringUtils.isNotBlank(query.getUsername())) {
            criteria.andUsernameEqualTo(query.getUsername());
        }
        if (StringUtils.isNotBlank(query.getPassword())) {
            // password加密在其它地方进行
            criteria.andPasswordEqualTo(query.getPassword());
        }
        if (StringUtils.isNotBlank(query.getState())) {
            criteria.andStateEqualTo(query.getState());
        }
        example.setOrderByClause("utc_create DESC");

        return secUserMapper.selectByExample(example);
    }

    @Override
    public List<UserDTO> listUserDTO(UserQuery query) throws Exception {
        Map<String, Object> paramsMap = new HashMap<>();
        if (StringUtils.isNotBlank(query.getSearchStr())) {
            paramsMap.put("searchStr", query.getSearchStr());
        }
        if (StringUtils.isNotBlank(query.getUsername())) {
            paramsMap.put("username", query.getUsername());
        }
        if (StringUtils.isNotBlank(query.getPassword())) {
            // password加密在其它地方进行
            paramsMap.put("password", query.getPassword());
        }
        if (StringUtils.isNotBlank(query.getState())) {
            paramsMap.put("state", query.getState());
        } else {
            paramsMap.put("stateDeleted", UserConst.STATE_CLOSED);
        }

        return secUserExtMapper.listUserDTO(paramsMap);
    }

    @Override
    public SecUser getUserByUsernameAndPassword(String username, String password) throws Exception {
        if (StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
            return null;
        }

        SecUserExample example = new SecUserExample();
        SecUserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        criteria.andPasswordEqualTo(password);
        List<SecUser> userList = secUserMapper.selectByExample(example);

        SecUser user = null;
        if (userList != null && userList.size() == 1) {
            user = userList.get(0);
            user.setPassword("");
        } else if (userList != null && userList.size() > 1) {
            ExceptionHelper.throwException(ErrorCode.MULTI_USER_RECORD_ERROR);
        }

        return user;
    }

    /**
     * 验重 用户信息
     * @param user
     * @return false 用户信息不存在;
     *         true 用户信息已存在.
     * @throws Exception
     */
    private boolean isUserExists(SecUser user) throws Exception {
        if (user == null || StringUtils.isBlank(user.getUsername())) {
            return false;
        }

        UserQuery query = new UserQuery();
        query.setUsername(user.getUsername());
        List<SecUser> userList = listUserBasicInfo(query);
        if (userList == null || userList.get(0).getId().equals(user.getId())) {
            return false;
        }

        return true;
    }

}
