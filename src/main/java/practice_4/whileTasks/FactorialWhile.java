package practice_4.whileTasks;
import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        int result = 1;
        int i = 1;

        while (i <= n) {
            result *= i;
            i++;
        }

        System.out.println("Факториал числа " + n + " = " + result);
    }
}
