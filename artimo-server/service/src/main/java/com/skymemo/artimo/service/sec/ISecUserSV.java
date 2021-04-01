package com.skymemo.artimo.service.sec;

import com.skymemo.artimo.entity.sec.SecUser;
import com.skymemo.artimo.service.sec.dto.UserDTO;
import com.skymemo.artimo.service.sec.dto.UserQuery;

import java.util.List;

/**
 * 用户基础信息
 * @author vc
 * @Date 2020-11-20
 */
public interface ISecUserSV {

    /**
     * 添加 用户信息
     *
     * @param user
     * @return
     * @throws Exception
     */
    int addUser(SecUser user) throws Exception;

    /**
     * 查询列表 用户基础信息
     * 此方法暴露password，谨慎使用
     *
     * @param query
     * @return
     * @throws Exception
     */
    @Deprecated()
    List<SecUser> listUserBasicInfo(UserQuery query) throws Exception;

    /**
     * 查询列表 用户信息
     * @param query
     * @return
     * @throws Exception
     */
    List<UserDTO> listUserDTO(UserQuery query) throws Exception;

    /**
     * 查询用户 根据用户名密码
     * @param username
     * @param password
     * @return
     * @throws Exception 存在多条匹配数据
     */
    SecUser getUserByUsernameAndPassword(String username, String password) throws Exception;
}
