package practice_4.breakContinueTasks;
import java.util.Scanner;

public class StopOnCommand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите строку: ");
            String input = scanner.nextLine();

            if (input.equals("stop")) {
                break;
            }
            System.out.println("Вы ввели: " + input);
        }

    System.out.println("Программа завершена");
        }
}
