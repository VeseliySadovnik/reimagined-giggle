package practice_8.part3;
import java.util.*;
import java.util.stream.*;

public class StartsWithB {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Варвара", "брошь", "ноутбук", "интерфейс", "бродяга");

        Optional<String> firstB = words.stream()
                .filter(s -> s.startsWith("Б"))
                .findFirst();

        firstB.ifPresentOrElse (
                word -> System.out.println("Первое слово на 'Б': " + word),
                () -> System.out.println("Слова на 'Б' не найдены.")
        );
    }
}
