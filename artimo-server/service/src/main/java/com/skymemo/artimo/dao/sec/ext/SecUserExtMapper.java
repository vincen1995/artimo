package com.skymemo.artimo.dao.sec.ext;

import com.skymemo.artimo.service.sec.dto.UserDTO;

import java.util.List;
import java.util.Map;

/**
 * Description here.
 *
 * @since JDK*.*
 * @author vc
 * @date 2021/1/19 11:35
 */
public interface SecUserExtMapper{


    /**
     * 查询用户列表
     * @return
     * @throws Exception
     */
    List<UserDTO> listUserDTO(Map<String, Object> paramsMap) throws Exception;

}
