package practice_4.switchTasks;
import java.util.Scanner;

public class GradeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите оценку (0-100): ");
        int score = scanner.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("Оценка A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("Оценка B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("Оценка C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("Оценка D");
        } else if (score >= 0 && score <= 59) {
            System.out.println("Оценка F");
        } else {
            System.out.println("Оценка вне допустимого диапазона");
        }
    }
}
