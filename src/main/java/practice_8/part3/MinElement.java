package practice_8.part3;
import java.util.*;
import java.util.stream.*;

public class MinElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 2, 10, 5);

        int min = numbers.stream()
                .min(Comparator.naturalOrder())
                .orElse(-1);

        System.out.println("Минимальное число в списке: " + min);
    }
}
