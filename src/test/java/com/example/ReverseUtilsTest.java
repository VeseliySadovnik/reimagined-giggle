package com.example;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ReverseUtilsTest {

    @ParameterizedTest
    @CsvSource({
            "'hello', 'olleh'",
            "'Java', 'avaJ'",
            "'', ''",
            "'a', 'a'",
            "'12345', '54321'",
    })
    void testReverse(String input, String expected) {
        ReverseUtils utils = new ReverseUtils();
        assertEquals(expected, utils.reverse(input));
    }

    @org.junit.jupiter.api.Test
    void testReverseNull() {
        ReverseUtils utils = new ReverseUtils();
        assertNull(utils.reverse(null));
    }
}
