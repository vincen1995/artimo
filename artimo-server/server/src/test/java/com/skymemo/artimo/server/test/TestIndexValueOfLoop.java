package com.skymemo.artimo.server.test;

public class TestIndexValueOfLoop {

    public static void main(String[] args) {
        int i;
        for (i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("The break value i=" + i);
                break;
            }
            System.out.println("i=" + i);
        }

        System.out.println("The final value i=" + i);
    }

}
