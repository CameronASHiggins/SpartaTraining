package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

class BubbleSorterTest {

    @ParameterizedTest
    @DisplayName("Given int arrays should return sorted arrays")
    @MethodSource("intArrays")
    void GivenIntArrays_BubbleSorterTest_ReturnsSortedArrays(int[] intArray, String expected){
        BubbleSorter bubbleSorter = new BubbleSorter();
        Assertions.assertEquals(Arrays.toString(bubbleSorter.sort(intArray)),expected);
    }

    private static Stream<Arguments> intArrays(){
        return Stream.of(
                Arguments.arguments(new int[] {5, 4, 3, 2, 1, 2}, Arrays.toString(new int[]{1, 2, 2, 3, 4, 5})),
                Arguments.arguments(new int[] {10, 14, 5, 98, 123, 4, 5, 2}, Arrays.toString(new int[]{2, 4, 5, 5, 10, 14, 98, 123})),
                Arguments.arguments(new int[] {-2, 123, 600, 18, 1, -4, -105, 21}, Arrays.toString(new int[]{-105, -4, -2, 1, 18, 21, 123, 600}))
        );
    }

    @ParameterizedTest
    @DisplayName("Given two int arrays should return merged arrays")
    @MethodSource("twoArrays")
    void GivenTwoIntArrays_BubbleSorterTest_ReturnsMergedArrays(int[] intArray1,int[] intArray2, String expected){
        BubbleSorter bubbleSorter = new BubbleSorter();
        Assertions.assertEquals(Arrays.toString(bubbleSorter.mergeBrute(intArray1,intArray2)),expected);
    }

    private static Stream<Arguments> twoArrays(){
        return Stream.of(
                Arguments.arguments(new int[] {5, 4, 3, 2, 1},new int[] {5, 4, 3, 2, 1}, Arrays.toString(new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5})),
                Arguments.arguments(new int[] {-2, 123, 600, 18, 1, -4, -105, 21},new int[] {5, 4, 3, 2, 1}, Arrays.toString(new int[]{-105, -4, -2, 1, 1, 2, 3, 4, 5, 18, 21, 123, 600}))
        );
    }
}