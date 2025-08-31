package practice_6;
import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        deque.addFirst("Element A");
        deque.addLast("Element B");
        deque.addLast("Element C");
        deque.addFirst("Element D");

        System.out.println("Содержимое очереди после добавлений: " + deque);

        String first = deque.removeFirst();
        System.out.println("Удален первый элемент: " + first);
        System.out.println("Содержимое очереди после удаления из начала: " + deque);

        String last = deque.removeLast();
        System.out.println("Удален последний элемент: " + last);
        System.out.println("Содержимое очереди после удаления из конца: " + deque);

        String first2 = deque.removeFirst();
        System.out.println("Удален первый элемент: " + first2);
        System.out.println("Содержимое очереди после удаления из начала: " + deque);

        String last2 = deque.removeLast();
        System.out.println("Удален последний элемент: " + last2);
        System.out.println("Содержимое очереди после удаления из конца: " + deque);
    }
}
