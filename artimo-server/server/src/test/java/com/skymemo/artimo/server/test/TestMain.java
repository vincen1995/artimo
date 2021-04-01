package com.skymemo.artimo.server.test;

import com.skymemo.artimo.entity.sec.SecUser;
import com.skymemo.common.util.collection.ListUtil;
import com.skymemo.common.util.date.DateUtil;
import com.skymemo.common.util.encrypt.MD5Util;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

    public static void main(String[] args) {
        /*String origin = "123456";
        System.out.println(MD5Util.encrypt(origin, null));*/

        /*List<SecUser> list1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            SecUser user = new SecUser();
            user.setUsername("user" + i);
            list1.add(user);
        }
        List<SecUser> list2 = null;

        System.out.println("\nlist1:");
        for (int i = 0; i < 5; i++) {
            System.out.println(ListUtil.get(list1, i).getUsername());
        }
        System.out.println("\nlist2:");
        for (int i = 0; i < 5; i++) {
            System.out.println(ListUtil.get(list2, 3));
        }*/

        System.out.println("UTC+8:" + DateUtil.getUTC8Current());
        System.out.println("UTC+0:" + DateUtil.getUTC0Current());

    }

}
