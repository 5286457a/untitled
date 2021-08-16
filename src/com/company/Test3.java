package com.company;

import java.io.IOException;

public class Test3 {

    public static void main(String[] args) {
        testThrow();
    }


    // 方法声明
    public static void testThrows() throws IOException {
        System.out.println("s");
        throw  new IOException();
    }

    public static void testThrow()  {
        // 方法内部
        throw  new IllegalArgumentException();
    }

    public static void testThrow2() throws IOException {
        // 方法内部
        throw  new IOException();
    }
}
