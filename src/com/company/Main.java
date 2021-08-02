package com.company;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<Integer> list = new ArrayList<>();
        list.add(4);

        Class<? extends List> clazz = list.getClass();
        Method add = clazz.getDeclaredMethod("add", Object.class);
        add.invoke(list , "hello");

        System.out.println(list);


        Integer[] nums = {1,2,3};
        String[] strs = {"A","B","C"};
        Double[] dous = {2.3,4.5,3.13};
        printArray(nums);

        printArray(strs);
        printArray(dous);

    }

    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

}
