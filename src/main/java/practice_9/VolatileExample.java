package practice_9;

public class VolatileExample {
    private static volatile boolean stop = false;

    public static void main(String[] args) {

        Thread worker = new Thread(() -> {
            int counter = 0;
            while (!stop) {
                counter++;
            }
            System.out.println("Поток остановлен. Итоговый счетчик: " + counter);
        });

        worker.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        stop = true;
        System.out.println("Флаг stop установлен в true.");
    }
}
