package practice_7;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class InvalidEmailException extends RuntimeException {
    public InvalidEmailException(String message) {
        super(message);
    }
}

public class EmailValidator {

    public static void validateEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(email);

        if (!matcher.matches()) {
            throw new InvalidEmailException("Неверный формат email: " + email);
        }

        System.out.println("Email корректен: " + email);
    }

    public static void main(String[] args) {
        try {
            validateEmail("test@example.com");
            validateEmail("invalid-email");
        } catch (InvalidEmailException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
