package practice_9;

public class TwoThreadsExample {
    public static void main(String[] args) {
        Runnable printA = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("A");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable printB = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("B");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread threadA = new Thread(printA);
        Thread threadB = new Thread(printB);

        threadA.start();
        threadB.start();
    }
}