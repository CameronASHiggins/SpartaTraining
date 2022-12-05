package com.sparta;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class FizzBuzzShould {

    @Test
    @DisplayName("given one, return one as a String")
    public void givenOne_Return_OneString() {
        Assertions.assertEquals("1",FizzBuzz.fizzBuzz(1));
    }

    @ParameterizedTest
    @CsvSource(value = {"1, 1", "2, 2", "4, 4", "7, 7","8, 8","11, 11","13, 13","14, 14","16, 16","17, 17"})
    @DisplayName("Given a number, return it as a String")
    public void givenANumber_Return_NumberAsString(int input, String expected){
        Assertions.assertEquals(expected, FizzBuzz.fizzBuzz(input));
    }

    @Test
    @DisplayName("Given 3, return \"Fizz\"")
    public void givenThree_Return_Fizz(){
        Assertions.assertEquals("Fizz",FizzBuzz.fizzBuzz(3));
    }

    @ParameterizedTest
    @ValueSource(ints = {3,6,9,12,18,21,24,27,33,36,39,42,48})
    @DisplayName("Given a multiple of 3, return \"Fizz\"")
    public void givenANumberDivisibleByThreeButNotFive_Return_Fizz(int input){
        Assertions.assertEquals("Fizz",FizzBuzz.fizzBuzz(input));
    }

    @Test
    @DisplayName("Given 5, return \"Buzz\"")
    public void givenFive_Return_Buzz(){
        Assertions.assertEquals("Buzz",FizzBuzz.fizzBuzz(5));
    }

    @ParameterizedTest
    @ValueSource(ints = {5,10,20,25,35,40,50})
    @DisplayName("Given a multiple of 5, return \"Buzz\"")
    public void givenANumberDivisibleByFiveButNotThree_Return_Buzz(int input){
        Assertions.assertEquals("Buzz",FizzBuzz.fizzBuzz(input));
    }

    @Test
    @DisplayName("Given 15, return \"FizzBuzz\"")
    public void givenFifteen_Return_Buzz(){
        Assertions.assertEquals("FizzBuzz",FizzBuzz.fizzBuzz(15));
    }

    @ParameterizedTest
    @ValueSource(ints = {15,30,45})
    @DisplayName("Given multiples of both 3 & 5, return \"FizzBuzz\"")
    public void givenANumberDivisibleByFifteen_Return_FizzBuzz(int input){
        Assertions.assertEquals("FizzBuzz",FizzBuzz.fizzBuzz(input));
    }
}