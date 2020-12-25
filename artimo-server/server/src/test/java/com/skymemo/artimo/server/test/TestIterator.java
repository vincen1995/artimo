package com.skymemo.artimo.server.test;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {

    public static void main(String[] args) {

        List<String> strList = new ArrayList<>();
        strList.add("str0");

        int i = 0;
        Iterator<String> iterator = strList.iterator();
        while(iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);

            strList.add("str" + (++i));
            if (i >= 9) {
                break;
            }
        }

    }

}
