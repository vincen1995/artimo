package com.skymemo.artimo.server.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright: Copyright (c) 2021 Asiainfo
 *
 * @ClassName: TestDivGroup
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: gongjia
 * @date: 2021/3/23 17:12
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2021/3/23     gongjia           v1.0.0               修改原因
 */
public class TestDivGroup {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestDivGroup.class);
    private static final int SIZE = 500;

    public static void main(String[] args) {
        // size = 0
        //divGroup(initList(null, 0));
        // size = 499
        //divGroup(initList(null, 499));
        // size = 500
        //divGroup(initList(null, 500));
        // size = 501
        //divGroup(initList(null, 501));
        // size = 1000
        divGroup(initList(null, 1000));
    }

    private static void divGroup(List<String> originList) {
        /*// 方案一 floor
        System.out.println("\n列表总长度：" + originList.size());
        int n = Math.floorDiv(originList.size(), SIZE);
        for (int i = 0; i <= n; i++) {
            int start = i * SIZE;
            int end = Math.min(originList.size(), (i + 1) * SIZE);

            System.out.println("第" + i + "组,开始...");
            List<String> subList = originList.subList(start, end);
            System.out.println("第" + i + "组,[" + start + ", " + end + "),子列表大小" + subList.size() + "\n");
        }*/

        // 方案二 ceil
        System.out.println("\n列表总长度：" + originList.size());
        int n = (int) Math.ceil(originList.size() / (double)SIZE);
        for (int i = 0; i < n; i++) {
            int start = i * SIZE;
            int end = Math.min(originList.size(), (i + 1) * SIZE);

            System.out.println("第" + i + "组,开始...");
            List<String> subList = originList.subList(start, end);
            System.out.println("第" + i + "组,[" + start + ", " + end + "),子列表大小" + subList.size() + "\n");
        }
    }

    private static List<String> initList(List<String> source, int size) {
        if (source == null) {
            source = new ArrayList<>();
        }

        source.clear();
        if (size == 0) {
            return source;
        }

        for (int i = 0; i < size; i++) {
            source.add(String.valueOf(i));
        }
        return source;
    }

}
