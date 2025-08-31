package practice_6;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorBothDirections {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList(
                "Задача A",
                "Задача B",
                "Задача C",
                "Задача D"
        ));

        System.out.println("Исходный список: " + list);

        ListIterator<String> it = list.listIterator();

        System.out.println("Прямой проход (вперед):");
        while (it.hasNext()) {
            String element = it.next();
            System.out.println(element);
        }

        System.out.println("Обратный проход (назад):");
        while (it.hasPrevious()) {
            String element = it.previous();
            System.out.println(element);
        }
        System.out.println("Проходы завершены. Итоговый список (без изменений): " + list);
    }
}
