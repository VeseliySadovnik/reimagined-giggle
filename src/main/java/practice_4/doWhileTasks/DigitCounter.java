package practice_4.doWhileTasks;
import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        int count = 0;
        do {
            count++;
            number /= 10;
        } while (number != 0);
        System.out.print("Количество цифр: " + count);
    }
}
