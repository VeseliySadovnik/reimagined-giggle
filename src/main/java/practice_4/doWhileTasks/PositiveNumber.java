package practice_4.doWhileTasks;
import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Введите положительное число: ");
            number = scanner.nextInt();
        } while (number <= 0);
        System.out.println("Вы ввели: " + number);
    }
}
