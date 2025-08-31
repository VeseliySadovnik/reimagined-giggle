package practice_6;
import java.util.LinkedHashSet;

public class AddUniqueExample {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        addUnique(set, "Java");
        addUnique(set, "Python");
        addUnique(set, "Java");
        addUnique(set, "C++");

        System.out.println("Содержимое LinkedHashSet: " + set);
    }
        public static void addUnique(LinkedHashSet<String> set, String element) {
            if (!set.contains(element)) {
                set.add(element);
                System.out.println("Элемент " + element + " добавлен.");
            } else {
                System.out.println("Элемент " + element + " уже существует, не добавляем.");
            }
        }
}
