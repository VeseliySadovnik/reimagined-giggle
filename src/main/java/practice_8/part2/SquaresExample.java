package practice_8.part2;
import java.util.*;
import java.util.stream.Collectors;

public class SquaresExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println("Исходный список чисел: " + numbers);
        System.out.println("Список квадратов чисел: " + squares);
    }
}
