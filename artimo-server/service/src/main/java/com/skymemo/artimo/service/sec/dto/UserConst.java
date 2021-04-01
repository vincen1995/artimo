package com.skymemo.artimo.service.sec.dto;

/**
 * 用户 常量
 * @author gongjia
 */
public interface UserConst {

    String STATE_GENERAL_DELETE = "0%";

    String STATE_CLOSED = "0";    // 用户注销
    String STATE_SYS_DEL = "00";    // 系统删除
    String STATE_NORMAL = "1";
    String STATE_SYS_LOCKED = "2";    // 系统封禁
    String STATE_EXCESSIVE_ATTEMPTS = "21";    // 密码出错上限

}
