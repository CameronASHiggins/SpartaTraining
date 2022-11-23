package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class stringSummerTest {

    @Test
    @DisplayName("countWords Test")
    public void countWordsTest(){
        String[] words = {"The", "cat", "in", "the", "hat"};
        char c = 't';
        int expected = 2;
        int result = stringSummer.countWords(words,c);
        Assertions.assertEquals(expected,result);
    }

    @Test
    @DisplayName("countWordsInString Test")
    public void countWordsInStringTest(){
        String phrase = "The cat in the hat";
        char c = 't';
        int expected = 2;
        int result = stringSummer.countWordsInString(phrase,c);
        Assertions.assertEquals(expected,result);
    }



}