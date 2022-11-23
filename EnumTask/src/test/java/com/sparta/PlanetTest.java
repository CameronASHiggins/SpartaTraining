package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanetTest {

    @Test
    @DisplayName("Is Earth Mars?")
    public void IsEarthMarsTest() {
        boolean expected = false;
        boolean result = (Planet.EARTH.getPlanetName() == Planet.MARS.getPlanetName());
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("Is Jupiter called Jupiter?")
    public void isJupiterJupiterTest() {
        Assertions.assertTrue(Planet.JUPITER.getPlanetName().equals("Jupiter"));
    }

    @Test
    @DisplayName("Are we all safe from burning?")
    public void isEarthNotOnFireTest() {
        Assertions.assertFalse(Planet.EARTH.getPlanetDistanceFromSol() <= 148.1f);
    }
}