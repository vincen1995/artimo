package com.skymemo.artimo.service.sec.dto;

import com.skymemo.artimo.entity.sec.SecUser;

/**
 * Description here.
 *
 * @since JDK*.*
 * @author vc
 * @date 2021/1/19 11:51
 */
public class UserDTO extends SecUser {
    private String password = "";    // 屏蔽password

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = "";
    }
}
