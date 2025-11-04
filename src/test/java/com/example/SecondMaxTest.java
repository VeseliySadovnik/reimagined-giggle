package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import java.util.NoSuchElementException;

class SecondMaxTest {
    private final SecondMax second = new SecondMax();

    @ParameterizedTest
    @CsvSource({
            "'3, 5, 7, 2', 5",
            "'1, 2, 3', 2",
    })
    void testSecondMax_ValidArrays(String input, int expected) {
        String[] parts = input.split(",");
        int[] numbers = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i].trim());
        }
        assertEquals(expected, second.findSecondMax(numbers));
    }

    @Test
    void testAllSameValues() {
        int[] numbers = {4, 4, 4, 4};

        assertThrows(NoSuchElementException.class, () -> second.findSecondMax(numbers));
    }

    @Test
    void testSingleValue() {
        int[] numbers = {8};

        assertThrows(NoSuchElementException.class, () -> second.findSecondMax(numbers));
    }

    @Test
    void testEmptyArray() {
        int[] numbers = {};

        assertThrows(NoSuchElementException.class, () -> second.findSecondMax(numbers));
    }
}

