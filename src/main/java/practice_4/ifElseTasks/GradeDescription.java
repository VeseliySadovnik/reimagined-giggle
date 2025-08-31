package practice_4.ifElseTasks;
import java.util.Scanner;

public class GradeDescription {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите оценку (1-5): ");
        int grade = scanner.nextInt();

        switch (grade) {
            case 5:
                System.out.println("Отлично");
                break;
            case 4:
                System.out.println("Хорошо");
                break;
            case 3:
                System.out.println("Удовлетворительно");
                break;
            case 2:
            case 1:
                System.out.println("Неудовлетворительно");
                break;
            default:
                System.out.println("Оценка вне диапазона 1-5");
        }
    }
}
