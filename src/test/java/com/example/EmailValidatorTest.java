package com.example;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmailValidatorTest {
    EmailValidator validator = new EmailValidator();

    @ParameterizedTest
    @ValueSource(strings = {
            "test@example.com",
            "user.name@domain.co",
            "a@b.cc"
    })
    void validEmailsReturnTrue(String email) {
        assertTrue(validator.isValidEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "bad@.com",
            "no-at-symbol",
            "@missing-user.com",
            "",
            "user@domain"
    })
    void invalidEmailsReturnFalse(String email) {
        assertFalse(validator.isValidEmail(email));
    }

    @ParameterizedTest
    @NullSource
    void nullReturnsFalse(String email) {
        assertFalse(validator.isValidEmail(email));
    }
}
