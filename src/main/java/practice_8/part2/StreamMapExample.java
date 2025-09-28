package practice_8.part2;
import java.util.*;
import java.util.stream.Collectors;

public class StreamMapExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "Functional", "API", "Lambda", "Code");

        List<Integer> lengths = words.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());

        System.out.println("Исходный список: " + words);
        System.out.println("Длины строк: " + lengths);
    }
}
