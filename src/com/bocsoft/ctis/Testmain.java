package com.bocsoft.ctis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Testmain {

    public static void main(String[] args) {
        String[] rlmsProSuptype = {"1","2","3"};
        List list = new ArrayList<String>();
        Collections.addAll(list,rlmsProSuptype);

        boolean a = list.contains("1");
        System.out.println(a);

        Arrays.asList("1","2","3","A");
        List<Object> list1 = new ArrayList<>();


    }
}
