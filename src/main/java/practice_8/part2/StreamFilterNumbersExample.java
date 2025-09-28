package practice_8.part2;
import java.util.*;
import java.util.stream.Collectors;

public class StreamFilterNumbersExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 12, 25, 33, 40, 47, 55, 60, 73);

        List<Integer> divisibleByFive = numbers.stream()
                .filter(n -> n % 5 == 0)
                .collect(Collectors.toList());

        System.out.println("Исходный список чисел: " + numbers);
        System.out.println("Числа, кратные 5: " + divisibleByFive);
    }
}
