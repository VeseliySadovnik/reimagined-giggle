package practice_4.ifElseTasks;
import java.util.Scanner;

public class MaxOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("Наибольшее число: " + a);
        } else if (b > a) {
            System.out.println("Наибольшее число: " + b);
        } else {
            System.out.println("Числа равны");
        }
    }
}
