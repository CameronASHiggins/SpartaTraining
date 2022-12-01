package com.sparta;

public class Overload {

    public static <T> void printArrayContents (T[] arr){
        for (T t : arr){
            System.out.print(t);
        }
    }

    public static <T extends Comparable<T>> T findMax (T a, T b, T c){
        T max;
        if (a.compareTo(b) > 0){
          return a;
        }
        if (b.compareTo(a) > 0){
            max = b;
        }
       else return c;
        return max;
    }
}
