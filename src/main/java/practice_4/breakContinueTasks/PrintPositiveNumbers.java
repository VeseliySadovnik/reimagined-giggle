package practice_4.breakContinueTasks;
import java.util.Scanner;

public class PrintPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите число (0 для выхода): ");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }
            if (number < 0) {
                continue;
            }

            System.out.println("Положительное: " + number);
        }
    }
}
