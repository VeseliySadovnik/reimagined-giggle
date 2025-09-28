package practice_8.part3;
import java.util.*;
import java.util.stream.*;

public class SumExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 2, 10, 5);

        int sum = numbers.stream()
                .mapToInt(n -> n)
                .sum();

        System.out.println("Сумма всех чисел: " + sum);
    }
}
