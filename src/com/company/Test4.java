package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

public class Test4 {

    public static void main(String[] args) throws IOException {
        Properties pros = new Properties();
        pros.load(new FileReader("/Users/apple/tx.txt"));
        final String a = pros.getProperty("a");
        final String b = pros.getProperty("b");
        if("wenjian".equals(a)&&"123456".equals(b)){
            System.out.println("登录成功");
        } else{System.out.println("用户名或者密码错误");
        }


        Random r = new Random();

        int num = r.nextInt(100) + 1;

        System.out.println(num);

        StringBuilder bs = new StringBuilder();



    }

    public static void printArry(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
