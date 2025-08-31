package practice_4.doWhileTasks;
import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "1234";
        String input;
        do {
            System.out.print("Введите пароль: ");
            input = scanner.nextLine();
        } while (!input.equals(correctPassword));
        System.out.println("Доступ разрешен");
    }
}
