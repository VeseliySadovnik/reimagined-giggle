package practice_8.part2;
import java.util.*;
import java.util.stream.Collectors;

public class StreamFilterExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "Functional", "API", "Lambda", "Code");

        List<String> filtered = words.stream()
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());

        System.out.println("Исходный список: " + words);
        System.out.println("Отфильтрованный список: " + filtered);
    }
}
