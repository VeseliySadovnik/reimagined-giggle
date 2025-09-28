package practice_8.part3;
import java.util.*;
import java.util.stream.*;

public class MaxElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 2, 10, 5);

        int max = numbers.stream()
                .max(Comparator.naturalOrder())
                .orElse(-1);

        System.out.println("Максимальное число: " + max);
    }
}
