package practice_8.part1;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> stringLength = s -> s.length();

        int length1 = stringLength.apply("текст");
        System.out.println("Длина строки 'текст': " + length1);

        int length2 = stringLength.apply("Hello, world!");
        System.out.println("Длина строки 'Hello, world!': " + length2);
    }
}
