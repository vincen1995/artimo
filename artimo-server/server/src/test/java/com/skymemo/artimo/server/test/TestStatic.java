package com.skymemo.artimo.server.test;

/**
 * Copyright: Copyright (c) 2021 Asiainfo
 *
 * @ClassName: TestStatic
 * @Description: static方法 继承与多态
 * @version: v1.0.0
 * @author: gongjia
 * @date: 2021/1/19 10:02
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2021/1/19     gongjia           v1.0.0               修改原因
 */
public class TestStatic {
    public static void main(String[] args) {
        System.out.println("A:" + TopClassA.getName());
        System.out.println("B:" + SubClassB.getName());
        System.out.println("C:" + SubClassC.getName());
        System.out.println("D:" + "不可Override static方法");
    }
}

class TopClassA {
    public static String getName() {
        return "TopClassA";
    }
}

class SubClassB extends TopClassA {
}

class SubClassC extends TopClassA {
    public static String getName() {
        return "SubClassC";
    }
}

/*
class SubClassD extends TopClassA {
    @Override
    public static String getName() {
        return "SubClassD";
    }
}*/
