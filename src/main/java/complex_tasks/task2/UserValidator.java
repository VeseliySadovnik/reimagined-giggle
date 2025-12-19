package complex_tasks.task2;
import java.util.regex.Pattern;

public class UserValidator {

    public static volatile boolean validationEnabled = true;

    private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$"
    );

    public void validate(User user) {
        if (user == null) {
            throw new InvalidUserException("User не может быть null");
        }

        if (!validationEnabled) return;

        validateName(user.getName());
        validateAge(user.getAge());
        validateEmail(user.getEmail());
    }

    private void validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidUserException("Имя не может быть пустым");
        }
        if (!Character.isUpperCase(name.charAt(0))) {
            throw new InvalidUserException("Имя должно начинаться с заглавной буквы");
        }
    }

    private void validateAge(int age) {
        if (age < 18 || age > 100) {
            throw new InvalidUserException("Возраст должен быть от 18 до 100");
        }
    }

    private void validateEmail(String email) {
        if (email == null || email.trim().isEmpty() ||
                !EMAIL_PATTERN.matcher(email).matches()) {
            throw new InvalidUserException("Неверный формат email");
        }
    }
}
