package com.example;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LeapYearTest {
    LeapYear ly = new LeapYear();

    @ParameterizedTest
    @ValueSource(ints = {2020, 2000, 1600})
    void leapYearsReturnTrue(int year) {
        assertTrue(ly.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {2019, 2021, 2022, 1900, 2100})
    void leapYearsReturnFalse(int year) {
        assertFalse(ly.isLeapYear(year));
    }

    @ParameterizedTest
    @CsvSource({
            "0, true",
            "4, true",
            "400, true"
    })
    void cornerCases(int year, boolean expected) {
        assertEquals(expected, ly.isLeapYear(year));
    }
}
