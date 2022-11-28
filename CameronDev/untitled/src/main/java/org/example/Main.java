package org.example;

public class Main {
    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5,3};
        System.out.println(sum(array,0,1));
        System.out.println(sum(array,0,2));
        System.out.println(sum(array,0,0));
        System.out.println(sum(array,0,6));
    }
    public static int sum(int[] array, int n1, int n2){
        int out = 0;
        for(int i = n1; i <= n2; i++){
            out += array[i];
        }
        return out;
    }
}