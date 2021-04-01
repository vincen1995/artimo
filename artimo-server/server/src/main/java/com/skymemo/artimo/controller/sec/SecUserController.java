package com.skymemo.artimo.controller.sec;

import com.skymemo.artimo.service.sec.ISecUserSV;
import com.skymemo.artimo.service.sec.dto.UserQuery;
import com.skymemo.common.response.IResponseData;
import com.skymemo.common.response.ResponseUtil;
import com.skymemo.common.response.impl.ResponseData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 用户信息
 *
 * @since JDK*.*
 * @author vc
 * @date 2020/12/22 20:21
 */
@RestController
@RequestMapping(value = "/user")
public class SecUserController {

    private static final Logger logger = LoggerFactory.getLogger(SecUserController.class);

    @Resource(name = "iSecUserSV")
    private ISecUserSV iSecUserSV;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public IResponseData listUser(UserQuery query) {

        try {
            return ResponseUtil.success(iSecUserSV.listUserBasicInfo(query));
        } catch (Exception e) {
            logger.error("SecUserController.listUser ----> 查询用户列表错误", e);
            return ResponseUtil.error(e);
        }
    }
}
