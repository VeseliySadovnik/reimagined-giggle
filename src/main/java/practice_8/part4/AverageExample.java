package practice_8.part4;
import java.util.*;
import java.util.stream.*;

public class AverageExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        double average = numbers.stream()
                .collect(Collectors.averagingInt(n -> n));

        System.out.println("Среднее значение: " + average);
    }
}
