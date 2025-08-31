package practice_4.whileTasks;
import java.util.Scanner;

public class EvenNumbersWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        int i = 1;

        while (i <= n) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
