package practice_8.part3;
import java.util.*;
import java.util.stream.*;

public class AnyMatchExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 7, 9, 13);

        boolean hasEven = numbers.stream()
                .anyMatch(n -> n % 2 == 0);

        if (hasEven) {
            System.out.println("В списке есть хотя бы одно четное число.");
        } else {
            System.out.println("В списке нет четных чисел.");
        }
    }
}
