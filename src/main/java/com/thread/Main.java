package com.thread;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        Map<Integer , String> map = new IdentityHashMap<>();
        Integer integer = new Integer(10);
        Integer integer2 = new Integer(10);
        map.put( integer, "bizhan");
        map.put(integer2 , "babak");

        System.out.println(map.get(integer2));



    }
}
