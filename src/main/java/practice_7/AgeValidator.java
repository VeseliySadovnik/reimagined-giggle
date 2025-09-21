package practice_7;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidator {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Некорректный возраст: " + age);
        } else {
            System.out.println("Возраст корректный: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(30);

            checkAge(199);

        } catch (InvalidAgeException e) {
            System.out.println("Ошибка при проверке возраста: " + e.getMessage());
        }

        System.out.println("Программа продолжает выполнение.");
    }
}
