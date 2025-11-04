package com.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MaxFinderUtilsTest {
    MaxFinderUtils utils = new MaxFinderUtils();

    @ParameterizedTest
    @CsvSource({
            "'3,5,7,2', 7",
            "'1', 1",
            "'-3,-5,-7,-2', -2",
    })
    void testFindMax(String input, int expected) {
        int[] numbers = Arrays.stream(input.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
        assertEquals(expected, utils.findMax(numbers));
    }

    @Test
    void testFindMaxEmptyArray() {
        int[] empty = {};
        assertThrows(java.util.NoSuchElementException.class, () -> utils.findMax(empty));
    }

    @Test
    void testFindMaxNullArray() {
        assertThrows(IllegalArgumentException.class, () -> utils.findMax(null));
    }
}
