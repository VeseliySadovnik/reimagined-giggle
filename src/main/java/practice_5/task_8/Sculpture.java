package practice_5.task_8;

public class Sculpture extends Exhibit {
    @Override
    void describe() {
        System.out.println("Скульптура - это древняя статуя");
    }

    @Override
    void preserve() {
        System.out.println("Нуждается в реставрации");
    }
}
