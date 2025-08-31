package practice_5.task_8;

public class Manuscript extends Exhibit {
    @Override
    void describe() {
        System.out.println("Манускрипт - это древний текст");
    }

    @Override
    void preserve() {
        System.out.println("Требует контролируемой влажности");
    }
}
