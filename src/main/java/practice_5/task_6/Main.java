package practice_5.task_6;

public class Main {
    public static void main(String[] args) {
        BotanicalGarden garden = new BotanicalGarden();

        garden.addPlant(new Orchid());
        garden.showCare();
        garden.removePlant();

        garden.addPlant(new Cactus());
        garden.showCare();
        garden.removePlant();
    }
}
