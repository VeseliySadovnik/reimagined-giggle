package practice_9;

public class SingleThreadExample {
    public static void main(String[] args) {
        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();

            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + " Привет из потока!");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println(threadName + " был прерван. Завершаем работу потока.");
                    break;
                }
            }
            System.out.println(threadName + " - работа завершена.");
        };
            Thread worker = new Thread(task, "Worker-1");
            worker.start();
    }
}
