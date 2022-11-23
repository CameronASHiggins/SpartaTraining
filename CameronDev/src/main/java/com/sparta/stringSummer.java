package com.sparta;

public class stringSummer {

    static int countWords(String[] strings, char c){
        int sum = 0;
        for(String s: strings){
            if(s.toLowerCase().startsWith(Character.toString(c))){
                sum ++;
            }
        }
        return sum;
    }

    static int countWordsInString(String inputString,char c){
        String[] splitString = inputString.split(" ");
        return countWords(splitString,c);
    }
}
