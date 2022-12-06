package com.sparta.Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] ints = {1,2,5,1,6,7,3,4,2};


        Arrays.sort(ints);
        System.out.println(ints[ints.length-1]);

    }
}
