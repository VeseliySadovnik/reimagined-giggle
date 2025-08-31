package practice_5.task_7;

public class Carousel extends Attraction {
    @Override
    void showInfo() {
        System.out.println("Спокойный аттракцион. Отлично подойдёт для маленьких детей!");
    }

    @Override
    void showMaintain() {
        System.out.println("Требуется техническое обслуживание!");
    }
}
