package practice_6;
import java.util.HashMap;
import java.util.Map;

public class UnderageUsers {
    public static void printUnderage(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() < 18) {
                System.out.println("Несовершеннолетний пользователь: " + entry.getKey() + " (" + entry.getValue() + " лет).");
            }
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> users = new HashMap<>();

        users.put("Анна", 19);
        users.put("Мария", 35);
        users.put("Сергей", 12);
        users.put("Николай", 10);
        users.put("Алексей", 17);

        printUnderage(users);
    }
}
