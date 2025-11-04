package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {

    private final NumberUtils utils = new NumberUtils();

    @Test
    void evenNumberShouldReturnTrue() {
        assertTrue(utils.isEven(4));
    }

    @Test
    void oddNumberShouldReturnFalse() {
        assertFalse(utils.isEven(5));
    }

    @Test
    void zeroShouldReturnTrue() {
        assertTrue(utils.isEven(0));
    }

    @Test
    void negativeEvenShouldReturnTrue() {
        assertTrue(utils.isEven(-4));
    }

    @Test
    void negativeOddShouldReturnFalse() {
        assertFalse(utils.isEven(-3));
    }
}