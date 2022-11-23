package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SummerTest {

    @Test
    @DisplayName("Given the values 1 to 10, using summer, returns the sum 55")
    public void given1To10_Summer_Returns55(){
        int[] myInts = {1,2,3,4,5,6,7,8,9,10};
        int expected = 55;
        int result = Summer.sumArray(myInts);
        Assertions.assertEquals(expected,result);
    }

    @ParameterizedTest
    @MethodSource("sumArrays")
    void arrays(int expected,int[] myInts){
        Assertions.assertEquals(expected,Summer.sumArray(myInts));
    }
    public static Stream<Arguments> sumArrays(){
        return Stream.of(
                Arguments.arguments(55, new int []{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}),
                Arguments.arguments(15, new int[]{1,2,3,4,5}),
                Arguments.arguments(32, new int[]{3,5,6,4,8,6}),
        );
    }

}