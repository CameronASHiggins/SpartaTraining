package com.sparta.Lists;

import javax.crypto.spec.PSource;
import java.util.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(1, "Data");
        hm.put(2, "Data");
        System.out.println(hm.get(1));
        System.out.println(hm.get(2));
        //hm.putIfAbsent(3, "More Data");
        try{
            //hm.put(3,"Even More Data");

            System.out.println(hm.get(3));
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
