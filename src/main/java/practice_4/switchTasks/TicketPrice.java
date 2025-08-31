package practice_4.switchTasks;
import java.util.Scanner;

public class TicketPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер дня недели (1-7): ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Цена билета 300 рублей");
                break;
            case 6:
            case 7:
                System.out.println("Цена билета 450 рублей");
                break;
            default:
                System.out.println("Неверный день недели");
        }
    }
}
