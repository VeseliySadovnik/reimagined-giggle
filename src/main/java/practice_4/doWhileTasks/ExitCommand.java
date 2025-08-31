package practice_4.doWhileTasks;
import java.util.Scanner;

public class ExitCommand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;
        do {
            System.out.print("Введите команду exit для выхода: ");
            command = scanner.nextLine();
        } while (!command.equals("exit"));
        System.out.print("Программа завершена.");
    }
}
