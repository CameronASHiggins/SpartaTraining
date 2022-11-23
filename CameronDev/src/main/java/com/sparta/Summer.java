package com.sparta;

public class Summer {
    public static void main(String[] args) {
        int[] myInts = {1, 2, 3, 4, 5};
        Summer summer = new Summer();
        System.out.println(summer.sumArray(myInts));
    }
    static int sumArray(int[] theInts){
        int sum = 0;
        for(int i: theInts){
            sum += i;
        }
        return sum;
    }
}
