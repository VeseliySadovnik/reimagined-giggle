package practice_8.part1;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0;

        boolean result1 = isEven.test(4);
        System.out.println("Число 4 четное? " + result1);

        boolean result2 = isEven.test(7);
        System.out.println("Число 7 четное? " + result2);
    }
}
