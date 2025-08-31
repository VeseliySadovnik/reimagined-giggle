package practice_5.task_6;

public class BotanicalGarden {
    private Plant plant;

    public void addPlant(Plant plant) {
        this.plant = plant;
        System.out.println("Растение добавлено в сад.");
    }

    public void showCare() {
        this.plant.showCare();
        System.out.println("Уход за растением осуществлен.");
    }

    public void removePlant() {
        System.out.println("Растение удалено из сада.");
        this.plant = null;
    }
}
