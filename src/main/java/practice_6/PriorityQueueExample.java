package practice_6;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(30);
        queue.add(10);
        queue.add(50);
        queue.add(20);
        queue.add(40);

        while (!queue.isEmpty()) {
            int number = queue.poll();
            System.out.println(number);
        }
    }
}
