package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {
    public static void main(String[] args) {
        Date d = new Date();
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        String str = f.format(d);
        System.out.println(str);
    }
}
