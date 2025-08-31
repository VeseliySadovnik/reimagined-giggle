package practice_6;
import java.util.HashSet;
import java.util.Set;

public class HashSetNameCheck {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("Анна");
        names.add("Мария");
        names.add("Жанна");
        names.add("Иннокентий");
        names.add("Сережа");

        String myName = "Алексей";

        if (names.contains(myName)) {
            System.out.println("Имя найдено: " + myName);
        } else {
            System.out.println("Имя не найдено: " + myName);
        }
    }
}
