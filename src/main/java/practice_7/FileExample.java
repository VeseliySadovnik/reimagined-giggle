package practice_7;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class FileExample {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("data.txt");
            System.out.println("Файл успешно открыт.");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        System.out.println("Программа завершена");
    }
}
