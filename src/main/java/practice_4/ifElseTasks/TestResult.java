package practice_4.ifElseTasks;
import java.util.Scanner;

public class TestResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество баллов (0-100): ");
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("Отлично");
        } else if (score >= 75) {
            System.out.println("Хорошо");
        } else if (score >= 60) {
            System.out.println("Удовлетворительно");
        } else {
            System.out.println("Неудовлетворительно");
        }
    }
}