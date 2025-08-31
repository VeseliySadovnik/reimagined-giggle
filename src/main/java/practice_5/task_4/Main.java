package practice_5.task_4;

public class Main {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();

        aquarium.addSeaCreature(new Shark());
        aquarium.showMovement();
        aquarium.removeSeaCreature();

        aquarium.addSeaCreature(new Starfish());
        aquarium.showMovement();
        aquarium.removeSeaCreature();
    }
}
