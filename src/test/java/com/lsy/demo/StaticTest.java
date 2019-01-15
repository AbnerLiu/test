package com.lsy.demo;

public class StaticTest {
    private static int a;
    static {
        StaticTest.a = 11;
        System.out.println(a);
        System.out.println("static block is called");
    }
    public static void main(String[] args) {

    }
}
