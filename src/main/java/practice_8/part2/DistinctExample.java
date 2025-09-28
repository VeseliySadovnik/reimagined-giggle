package practice_8.part2;
import java.util.*;
import java.util.stream.Collectors;

public class DistinctExample {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "apple", "opange", "banana", "grape");

        List<String> uniqueItems = items.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Исходный список: " + items);
        System.out.println("Уникальные элементы: " + uniqueItems);
    }
}
