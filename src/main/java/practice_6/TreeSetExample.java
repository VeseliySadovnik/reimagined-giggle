package practice_6;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        int value = -5;

        Integer higher = numbers.higher(value);
        Integer lower = numbers.lower(value);

        System.out.println("Задано число: " + value);

        if (higher != null) {
            System.out.println("Ближайшее большее число: " + higher);
        } else {
            System.out.println("Более большого числа нет в наборе.");
        }

        if (lower != null) {
            System.out.println("Ближайшее меньшее число: " + lower);
        } else {
            System.out.println("Более маленького числа нет в наборе.");
        }
    }
}
