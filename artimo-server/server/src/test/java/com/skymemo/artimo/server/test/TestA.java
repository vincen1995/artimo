package com.skymemo.artimo.server.test;

/**
 * A temp test class.
 * @author vc
 */
public class TestA {

    public static void main(String[] args) {

        Object objC = new clazzC();
        if (objC.getClass().equals(clazzA.class)) {
            System.out.println("A");
        } else if (objC.getClass().equals(clazzB.class)) {
            System.out.println("B");
        } else if (objC.getClass().equals(clazzC.class)) {
            System.out.println("C");
        } else if (objC.getClass().equals(clazzD.class)){
            System.out.println("D");
        }

    }

}

class clazzA {}

class clazzB extends clazzA{}

class clazzC extends clazzB{}

class clazzD extends clazzC{}
