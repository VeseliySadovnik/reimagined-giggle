package practice_5.task_5;

public class Chicken extends FarmAnimal {
    @Override
    void showFeed() {
        System.out.println("Курица ест зерно.");
    }

    @Override
    void showCare() {
        System.out.println("Курица нуждается в кормушке.");
    }

    @Override
    void showProduce() {
        System.out.println("Курица несёт яйца.");
    }
}
