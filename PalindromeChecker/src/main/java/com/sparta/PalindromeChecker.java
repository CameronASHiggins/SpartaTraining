package com.sparta;

public class PalindromeChecker {
    public PalindromeChecker(){}
    public boolean check(String inputString) {
        boolean isPalindrome;
        String formattedInput = inputString.toLowerCase().replaceAll("[^a-z0-9]","");
        char[] inAsArray = formattedInput.toCharArray();  // This creates an array of chars using the formatted input
        int start = 0;                                    // while also removing all non-alphabetical characters if any were present and converting to lowercase
        int end =  inAsArray.length-1;
        char currentChar;
        while(end>start){
            currentChar = inAsArray[start];
            inAsArray[start] = inAsArray[end];
            inAsArray[end] = currentChar;
            end--; start++;
        }
        return (new String(inAsArray).equals(formattedInput));
    }
    public String check(String[] inputStringArray) {
        boolean containsPalindromes = false;
        String containedPalindromes = new String("That array contains these palindromes:");
        for(String s : inputStringArray){
            if(check(s)){
                containedPalindromes = containedPalindromes + (" " + s);
                containsPalindromes = true;
            }
        }
        if (containsPalindromes){
            return containedPalindromes;
        } else return "There were no palindromes in that array";
    }
}
