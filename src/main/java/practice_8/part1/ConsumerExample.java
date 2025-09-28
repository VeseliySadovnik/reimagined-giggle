package practice_8.part1;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> printer = s -> System.out.println(s);

        printer.accept("Привет");

        printer.accept("Java - это восхитительно!");
        printer.accept("Функциональные интерфейсы - это лучшее, что случилось в моей жизни!");
    }
}
