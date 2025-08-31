package practice_4.breakContinueTasks;

public class SkipMultOfTree {
    public static void main(String[] args) {
        for (int i = 1; i <=20; i++) {
            if (i % 3 == 0) {
                continue;
            }
        System.out.println(i);
        }
    }
}
