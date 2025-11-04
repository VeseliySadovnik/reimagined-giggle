package com.example;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CheckNumberTest {
    private final CheckNumber checking = new CheckNumber();

    @ParameterizedTest
    @CsvSource({
            "'+1 1234567890', true",
            "'+44 9876543210', true",
            "'+999 1111111111', true"
    })

    void testValidNumbers(String phone, boolean expected) {
        assertEquals(expected, checking.isValidPhoneNumber(phone));
    }

    @ParameterizedTest
    @CsvSource({
            "'12345', false",
            "'invalid', false",
            "'+1 abcdefghij', false",
            "'+1234 1234567890', false",
            "'+1 123', false",
            "'', false"
    })
    void testInvalidNumbers(String phone, boolean expected) {
        assertEquals(expected, checking.isValidPhoneNumber(phone));
    }

    @Test
    void testNullValue() {
        assertThrows(IllegalArgumentException.class, () -> checking.isValidPhoneNumber(null));
    }
}
