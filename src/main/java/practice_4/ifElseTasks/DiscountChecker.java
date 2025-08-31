package practice_4.ifElseTasks;
import java.util.Scanner;

public class DiscountChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Скидка 25%");
        } else if (age >= 65) {
            System.out.println("Скидка 30%");
        } else {
            System.out.println("Скидки нет((");
        }
    }
}
