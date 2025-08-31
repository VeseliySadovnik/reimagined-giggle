package practice_4.switchTasks;
import java.util.Scanner;

public class CommandProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите команду (start, stop, restart, status): ");
        String command = scanner.nextLine();

        switch (command) {
            case "start":
                System.out.println("Система запущена");
                break;
            case "stop":
                System.out.println("Система остановлена");
                break;
            case "restart":
                System.out.println("Система перезапущена");
                break;
            case "status":
                System.out.println("Состояние системы: нормальное");
                break;
            default:
                System.out.println("Неизвестная команда");
        }
    }
}
