package com.sparta;

public class FizzBuzz {
    public static String fizzBuzz(Integer n) {
        String result = "";
        if(n % 3 == 0){
            result += "Fizz";
        }
        if (n % 5 == 0){
            result += "Buzz";
        }
        if(n % 3 != 0 && n % 5 != 0){
            result = n.toString();
        }
        return result;
    }
}
