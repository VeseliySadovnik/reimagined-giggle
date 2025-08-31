package practice_4.switchTasks;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.println("Введите оператор (+, -, *, /): ");
        String op = scanner.next();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        switch (op) {
            case "+":
                System.out.println("Результат: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Результат: " + (num1 - num2));
                break;
            case "*":
                System.out.println("Результат: " + (num1 * num2));
                break;
            case "/":
                if (num2 != 0) {
                    System.out.println("Результат: " + (num1 / num2));
                } else {
                    System.out.println("Ошибка: деление на ноль!");
                }
                break;
            default:
                System.out.println("Неверный оператор");
        }
    }
}
