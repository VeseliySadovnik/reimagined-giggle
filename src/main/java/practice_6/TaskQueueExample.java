package practice_6;
import java.util.LinkedList;

public class TaskQueueExample {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();

        queue.add("Задача 1: протестировать приложение");
        queue.add("Задача 2: написать тест-кейсы");
        queue.add("Задача 3: отправить письмо лиду");

        System.out.println("Изначальная очередь: " + queue);

        while (!queue.isEmpty()) {
            String task = queue.poll();

            System.out.println("Обрабатываем: " + task);

            System.out.println("Осталось в очереди: " + queue);
        }
        System.out.println("Все задачи обработаны");
    }
}
