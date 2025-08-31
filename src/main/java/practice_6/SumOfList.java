package practice_6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, -2, 13, 4, 100));

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Сумма всех чисел в списке: " + sum);
    }

}
