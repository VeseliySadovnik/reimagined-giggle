package com.example;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {
    Factorial factorial = new Factorial();

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 5, 7})
    void testFactorialPositiveNumbers(int input) {
        int expected;
        switch (input) {
            case 0 -> expected = 1;
            case 1 -> expected = 1;
            case 5 -> expected = 120;
            case 7 -> expected = 5040;
            default -> throw new IllegalArgumentException("Unexpected test input");
        }

        assertEquals(expected, factorial.factorial(input));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, -3, -5})
    void testFactorialNegativeNumbers(int input) {
        assertThrows(IllegalArgumentException.class, () -> factorial.factorial(input));
    }
}
