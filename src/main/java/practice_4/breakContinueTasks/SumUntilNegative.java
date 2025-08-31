package practice_4.breakContinueTasks;
import java.util.Scanner;

public class SumUntilNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();

            if (number < 0) {
                break;
            }
             sum += number;
        }
        System.out.println("Сумма чисел: " + sum);
    }
}
