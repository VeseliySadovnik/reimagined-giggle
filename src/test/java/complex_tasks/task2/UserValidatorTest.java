package complex_tasks.task2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {
    private final UserValidator validator = new UserValidator();

    @Test
    void testValidateName_NullName_ThrowsException() {
        User user = new User(null, 25, "valid@example.com");
        assertThrows(InvalidUserException.class,
                () -> validator.validate(user));
    }

    @Test
    void testValidateName_EmptyName_ThrowsException() {
        User user = new User("", 25, "valid@example.com");
        assertThrows(InvalidUserException.class,
                () -> validator.validate(user));
    }

    @Test
    void testValidateName_LowercaseFirstLetter_ThrowsException() {
        User user = new User("alice", 25, "valid@example.com");
        assertThrows(InvalidUserException.class,
                () -> validator.validate(user));
    }

    @Test
    void testValidateName_ValidName_DoesNotThrow() {
        User user = new User("Alice", 25, "valid@example.com");
        assertDoesNotThrow(() -> validator.validate(user));
    }

    @Test
    void testValidateAge_TooYoung_ThrowsException() {
        User user = new User("Alice", 17, "valid@example.com");
        assertThrows(InvalidUserException.class,
                () -> validator.validate(user));
    }

    @Test
    void testValidateAge_TooOld_ThrowsException() {
        User user = new User("Alice", 101, "valid@example.com");
        assertThrows(InvalidUserException.class,
                () -> validator.validate(user));
    }

    @Test
    void testValidateAge_ValidAge_DoesNotThrow() {
        User user = new User("Alice", 35, "valid@example.com");
        assertDoesNotThrow(() -> validator.validate(user));
    }

    @Test
    void testValidateEmail_NullEmail_ThrowsException() {
        User user = new User("Alice", 25, null);
        assertThrows(InvalidUserException.class,
                () -> validator.validate(user));
    }

    @Test
    void testValidateEmail_EmptyEmail_ThrowsException() {
        User user = new User("Alice", 25, "");
        assertThrows(InvalidUserException.class,
                () -> validator.validate(user));
    }

    @Test
    void testValidateEmail_InvalidFormat_ThrowsException() {
        User user1 = new User("Alice", 25, "no-at-symbol");
        User user2 = new User("Alice", 25, "bad@domain");
        assertThrows(InvalidUserException.class, () -> validator.validate(user1));
        assertThrows(InvalidUserException.class, () -> validator.validate(user2));
    }

    @Test
    void testValidateEmail_ValidEmail_DoesNotThrow() {
        User user1 = new User("Alice", 25, "test@example.com");
        User user2 = new User("Bob", 45, "a.b-c_d@example.co.uk");
        assertDoesNotThrow(() -> validator.validate(user1));
        assertDoesNotThrow(() -> validator.validate(user2));
    }

    @Test
    void testValidate_NullUser_ThrowsException() {
        assertThrows(InvalidUserException.class,
                () -> validator.validate(null));
    }

    @Test
    void testValidate_AllValid_DoesNotThrow() {
        User user = new User("Charlie", 30, "test@example.com");
        assertDoesNotThrow(() -> validator.validate(user));
    }

    @Test
    void testValidate_ValidationDisabled_DoesNotThrow() {
        UserValidator.validationEnabled = false;
        try {
            User userInvalidEmail = new User("Alice", 25, "no-at-symbol");
            User userInvalidAge = new User("alice", 15, "bad@domain");

            assertDoesNotThrow(() -> validator.validate(userInvalidEmail));
            assertDoesNotThrow(() -> validator.validate(userInvalidAge));
        } finally {
            UserValidator.validationEnabled = true; // восстанавливаем после теста
        }
    }

}
