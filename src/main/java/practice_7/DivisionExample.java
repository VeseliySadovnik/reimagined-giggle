package practice_7;

public class DivisionExample {
    public static void divide(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Результат деления: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль недопустимо.");
        }
    }

    public static void main(String[] args) {
        divide(10, 2);

        divide(10, 0);
    }
}
