package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Classification_Tests {
    @ParameterizedTest
    @ValueSource(ints = {0,7,12})
    @DisplayName("Given ages of viewers up to 12 with adult accompaniment, films up to 12A should be allowed to be viewed")
    public void GivenAgesUpTo12WithAdultsPresent_AvailableFilms_ReturnsUPG1212A(int agesOfViewer){
        String expecting = "U, PG, 12 & 12A films are available.";
        String result = FilmClassifications.availableClassifications(agesOfViewer, true);
        Assertions.assertEquals(expecting,result);
    }

    @ParameterizedTest
    @ValueSource(ints = {0,7,12})
    @DisplayName("Given ages of viewers up to 12 without adult accompaniment, films up to 12 should be allowed to be viewed")
    public void GivenAgesUpTo12WithoutAdultsPresent_AvailableFilms_ReturnsUPG12(int agesOfViewer){
        String expecting = "U, PG & 12 films are available.";
        String result = FilmClassifications.availableClassifications(agesOfViewer, false);
        Assertions.assertEquals(expecting,result);
    }

    @ParameterizedTest
    @ValueSource(ints = {12,13,14})
    @DisplayName("Given ages of viewers older than 12 but younger than 15, films up to 12A should be allowed to be viewed")
    public void GivenAgesFrom12To14_AvailableFilms_ReturnsUPG1212A(int agesOfViewer){
        String expecting = "U, PG, 12 & 12A films are available.";
        String result = FilmClassifications.availableClassifications(agesOfViewer, true);
        Assertions.assertEquals(expecting,result);
    }
    @ParameterizedTest
    @ValueSource(ints = {15,16,17})
    @DisplayName("Given ages of viewers older than 15 but younger than 18, films up to 15 should be allowed to be viewed")
    public void GivenAgesFrom15To17_AvailableFilms_ReturnsUPG1212A15(int agesOfViewer){
        String expecting = "U, PG, 12, 12A & 15 films are available.";
        String result = FilmClassifications.availableClassifications(agesOfViewer, true);
        Assertions.assertEquals(expecting,result);
    }

    @ParameterizedTest
    @ValueSource(ints = {18,30,100})
    @DisplayName("Given ages of viewers older 18, films of all classifications should be allowed to be viewed")
    public void GivenAges18AndUp_AvailableFilms_ReturnsAllFilms(int agesOfViewer){
        String expecting = "All films are available.";
        String result = FilmClassifications.availableClassifications(agesOfViewer, true);
        Assertions.assertEquals(expecting,result);
    }

}