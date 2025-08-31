package practice_6;
import java.util.HashSet;
import java.util.Set;

public class HashSetContains {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
        numbers.add(80);
        numbers.add(90);
        numbers.add(100);

        System.out.println("Содержимое HashSet после добавления 10 чисел: " + numbers);

        boolean addedDuplicate = numbers.add(30);
        System.out.println("Попытка добавить 30 повторно: add вернуло " + addedDuplicate);

        int target = 700;

        if (numbers.contains(target)) {
            System.out.println("HashSet содержит число " + target);
        } else {
            System.out.println("HashSet НЕ содержит число " + target);
        }
    }
}
