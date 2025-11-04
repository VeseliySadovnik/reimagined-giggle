package com.example;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CountWordsTest {
    private final CountWords word = new CountWords();

    @ParameterizedTest
    @CsvSource({
            "'Hello world', 2",
            "' Java is awesome ', 3",
            "'', 0",
            "'   ', 0"
    })
    void testCountWords_ValidCases(String input, int expected) {
        int actual = word.countWords(input);
        assertEquals(expected, actual);
    }

    @Test
    void testCountWords_NullThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> word.countWords(null));
    }
}
