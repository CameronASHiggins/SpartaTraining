package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class GreetingExampleTest {
    @Test
    @DisplayName("My first test")
    public void firstTest(){
        Assertions.assertTrue(5 == 5);
    }

    @Test
    @DisplayName("Given a time of 21, greeting returns Good Evening")
    public void givenATime21_Greeting_ReturnsGoodEvening(){
        // Arrange (setup)
        int time = 21;
        String expecting = "Good evening!";
        // Act
        String result = GreetingExample.greeting(time);
        // Assert
        Assertions.assertEquals(expecting, result);
    }

    @Test
    @DisplayName("Given a time of 13, greeting returns Good Afternoon")
    public void givenATime13_Greeting_ReturnsGoodAfternoon() {
        // Arrange (setup)
        int time = 13;
        String expecting = "Good afternoon!";
        // Act
        String result = GreetingExample.greeting(time);
        // Assert
        Assertions.assertEquals(expecting, result);
    }

    @Test
    @DisplayName("Given a time of 7, greeting returns Good Morning")
    public void givenATime7_Greeting_ReturnsGoodMorning() {
        // Arrange (setup)
        int time = 7;
        String expecting = "Good morning!";
        // Act
        String result = GreetingExample.greeting(time);
        // Assert
        Assertions.assertEquals(expecting, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,19,20,21,22,23,24})
    @DisplayName("Given all hours from 6pm to 5am, greeting returns Good Evening")
    public void givenTimeBetween7pmTo4am_Greeting_ReturnsGoodEvening(int hours) {
        String expecting = "Good evening!";
        String result = GreetingExample.greeting(hours);
        Assertions.assertEquals(expecting,result);
    }

    @ParameterizedTest
    @ValueSource(ints = {13,14,15,16,18})
    @DisplayName("Given all hours from 12pm to 6pm, greeting returns Good Afternoon")
    public void givenTimeBetween1pmTo6pm_Greeting_ReturnsGoodAfternoon(int hours) {
        String expecting = "Good afternoon!";
        String result = GreetingExample.greeting(hours);
        Assertions.assertEquals(expecting,result);
    }

    @ParameterizedTest
    @ValueSource(ints = {5,8,12})
    @DisplayName("Given all hours from 5am to 12pm, greeting returns Good Morning")
    public void givenMorningTimes_Greeting_ReturnsGoodMorning(int hours) {
        String expecting = "Good morning!";
        String result = GreetingExample.greeting(hours);
        Assertions.assertEquals(expecting,result);
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,19,20,21,22,23,24})
    @DisplayName("Given all hours from 6pm to 5am, greeting returns Good Evening")
    public void givenTimeBetween7pmTo4am_GreetingSwitch_ReturnsGoodEvening(int hours) {
        String expecting = "Good evening!";
        String result = GreetingExample.greetingSwitch(hours);
        Assertions.assertEquals(expecting, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {13,14,15,16,18})
    @DisplayName("Given all hours from 12pm to 6pm, greeting returns Good Afternoon")
    public void givenTimeBetween1pmTo6pm_GreetingSwitch_ReturnsGoodAfternoon(int hours) {
        String expecting = "Good afternoon!";
        String result = GreetingExample.greetingSwitch(hours);
        Assertions.assertEquals(expecting, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {5,8,12})
    @DisplayName("Given all hours from 5am to 12pm, greeting returns Good Morning")
    public void givenMorningTimes_GreetingSwitch_ReturnsGoodMorning(int hours) {
        String expecting = "Good morning!";
        String result = GreetingExample.greetingSwitch(hours);
        Assertions.assertEquals(expecting,result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"11:44", "06:04"})
    @DisplayName("given a verbose time as string of times from 5am to 12pm, greeting returns Good morning")
    public void givenMorningTimes_GreetingVerbose_ReturnsGoodMorning(String vTime){
        String expecting = "Good morning!";
        String result = GreetingExample.greetingVerbose(vTime);
        Assertions.assertEquals(expecting,result);
    }

}