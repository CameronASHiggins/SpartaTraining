package com.sparta;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        BubbleSorter b1 = new BubbleSorter();

//        System.out.println(Arrays.toString(b1.sort(new int[]{5, 4, 3, 2, 1, 2})));
//        System.out.println(Arrays.toString(b1.mergeBrute(new int[]{-2, 123, 600, 18, 1, -4, -105, 21},new int[]{5, 4, 3, 2, 1})));
        System.out.println(Arrays.toString(b1.merge(b1.sort(new int[]{-2, 123, 600, 18, 1, -4, -105, 21}), b1.sort(new int[]{5, 4, 3, 2, 1}))));

    }
}