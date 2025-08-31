package practice_5.task_5;

public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm();

        farm.addFarmAnimal(new Cow());
        farm.showFeed();
        farm.showCare();
        farm.showProduce();
        farm.removeFarmAnimal();

        farm.addFarmAnimal(new Chicken());
        farm.showFeed();
        farm.showCare();
        farm.showProduce();
        farm.removeFarmAnimal();
    }
}
