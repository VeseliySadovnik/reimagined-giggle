package com.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void testHello() {
        assertEquals(2, StringUtils.countVowels("hello"));
    }

    @Test
    void testJava() {
        assertEquals(2, StringUtils.countVowels("java"));
    }

    @Test
    void testUpperCase() {
        assertEquals(5, StringUtils.countVowels("AEIOU"));
    }

    @Test
    void testEmpty() {
        assertEquals(0, StringUtils.countVowels(""));
    }

    @Test
    void testNoVowels() {
        assertEquals(0, StringUtils.countVowels("bcdfg"));
    }

    @Test
    void testNull() {
        assertThrows(IllegalArgumentException.class,
                () -> StringUtils.countVowels(null));
    }
}
