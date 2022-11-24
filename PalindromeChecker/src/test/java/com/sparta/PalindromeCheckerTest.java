package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

class PalindromeCheckerTest {

//    @ParameterizedTest
//    @DisplayName("Given palindromic strings this test should return true")
//    @ValueSource(strings = {"race car","radar","Hannah","ABBA!","a1a1a1a"})
//    void GivenPalindromicStrings_PalindromeCheckerTest_ReturnsTrue(String strings) {
//        PalindromeChecker palindromeChecker = new PalindromeChecker();
//        boolean expected = true;
//        boolean result = (palindromeChecker.check(strings));
//        Assertions.assertEquals(expected,result);
//    }

    @ParameterizedTest
    @DisplayName("Given string arrays containing a mix of palindromes and non-palindromes should return any palindromes")
    @MethodSource("StringArraysPalindromes")
    void GivenStringArraysContainingAMixOfPalindromesAndNonPalindromes_PalindromeCheckerTest_ReturnsAnyPalindromes(String[] stringArray, String expected){
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        Assertions.assertEquals(palindromeChecker.check(stringArray),expected);
    }

    private static Stream<Arguments> StringArraysPalindromes(){
        return Stream.of(
                Arguments.arguments(new String[] {"race car","howdy","Hannah","ABBA!","a1a1a1a",}, "That array contains these palindromes: race car Hannah ABBA! a1a1a1a"),
                Arguments.arguments(new String[] {"race car","awesome"},"That array contains these palindromes: race car")
        );
    }

    @ParameterizedTest
    @DisplayName("Given string arrays containing no palindromes should return no palindromes")
    @MethodSource("StringArraysNoPalindromes")
    void GivenStringArraysContainingNoPalindromes_PalindromeCheckerTest_ReturnsNoPalindromes(String[] stringArray, String expected){
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        Assertions.assertEquals(palindromeChecker.check(stringArray),expected);
    }

    private static Stream<Arguments> StringArraysNoPalindromes(){
        return Stream.of(
                Arguments.arguments(new String[] {"nope","no", "palindromes", "here"}, "There were no palindromes in that array"),
                Arguments.arguments(new String[] {"very","awesome","but","no","palindromes"},"There were no palindromes in that array")
        );
    }
}