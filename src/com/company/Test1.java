package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test1 {

    public static void main(String[] args) {

        HashMap<String,String> map = new HashMap<>();
        map.put("zhangsan","shanghai");
        map.put("lisi","beijing");
        map.put("wangwu","nanjing");
        map.put("zhaoliu","shuzhou");

        Set<Map.Entry<String,String>> entries = map.entrySet();
        for(Map.Entry<String,String> m : entries){
            String k = m.getKey();
            String v = m.getValue();
            System.out.println(k + "," + v);
        }



    }

}
