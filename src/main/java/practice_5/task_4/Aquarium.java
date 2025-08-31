package practice_5.task_4;

public class Aquarium {
    private SeaCreature seaCreature;

    public void addSeaCreature(SeaCreature seaCreature) {
        this.seaCreature = seaCreature;
        System.out.println("Морское существо добавлено в аквариум");
    }

    public void showMovement() {
        this.seaCreature.showMovement();
        System.out.println("Тип движения морского существа показан");
    }

    public void removeSeaCreature() {
        System.out.println("Морское существо удалено из аквариума");
        this.seaCreature = null;
    }
}
