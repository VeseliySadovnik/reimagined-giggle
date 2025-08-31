package practice_4.whileTasks;
import java.util.Scanner;

public class CountdownWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите положительное число: ");
        int number = scanner.nextInt();

        while (number >= 1) {
            System.out.println(number);
            number--;
        }
    }
}
