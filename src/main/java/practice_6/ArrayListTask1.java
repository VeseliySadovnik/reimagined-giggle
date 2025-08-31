package practice_6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTask1 {
    public static void main(String[] args) {
        List<Integer> fixedList = Arrays.asList(10, 20, 30, 40, 50);

        List<Integer> numbers = new ArrayList<>(fixedList);

        numbers.add(60);

        System.out.println("Список чисел: " + numbers);
    }
}
