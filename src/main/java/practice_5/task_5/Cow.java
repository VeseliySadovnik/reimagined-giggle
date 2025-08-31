package practice_5.task_5;

public class Cow extends FarmAnimal {
    @Override
    void showFeed() {
        System.out.println("Корова ест траву.");
    }

    @Override
    void showCare() {
        System.out.println("Корова требует выпаса на лугу.");
    }

    @Override
    void showProduce() {
        System.out.println("Корова даёт молоко.");
    }
}
