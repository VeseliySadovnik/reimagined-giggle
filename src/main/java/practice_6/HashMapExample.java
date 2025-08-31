package practice_6;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<>();

        people.put("Анна", 25);
        people.put("Иван", 30);
        people.put("Мария", 35);
        people.put("Сергей", 28);
        people.put("Елена", 22);

        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            System.out.println("Имя: " + entry.getKey() + ", возраст: " + entry.getValue());
        }
    }
}
