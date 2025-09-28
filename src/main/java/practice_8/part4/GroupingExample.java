package practice_8.part4;
import java.util.*;
import java.util.stream.*;

public class GroupingExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Москва", "Берлин", "Будапешт", "Брюссель", "Мадрид", "Киев", "Краснодар");
        Map<String, List<String>> grouped = words.stream()
                .collect(Collectors.groupingBy(s -> s.substring(0, 1)));

        System.out.println(grouped);
    }
}
