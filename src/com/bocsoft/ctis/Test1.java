package com.bocsoft.ctis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test1 {

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name","zhangsan");
        map.put("sex",null);
        map.put(null,"kong");
        System.out.println(map.toString());
        System.out.println(map.get(null));
        System.out.println(map.get("sex"));


        ArrayList<String> list = new ArrayList<>();
        list.add(null);
        list.add("1");
        list.add(null);
        System.out.println(list);


    }





}
