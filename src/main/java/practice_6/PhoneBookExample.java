package practice_6;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBookExample {
    public static void main(String[] args) {
        LinkedHashMap<String, String> phoneBook = new LinkedHashMap<>();

        phoneBook.put("Аня", "+7900900900");
        phoneBook.put("Катя", "+7900900987");
        phoneBook.put("Сережа", "+7977900900");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя для поиска: ");
        String name = scanner.nextLine();

        if (phoneBook.containsKey(name)) {
            String phone = phoneBook.get(name);
            System.out.println("Номер телефона " + name + ": " + phone);
        } else {
            System.out.println("Контакт не найден.");
        }
        scanner.close();
    }
}
