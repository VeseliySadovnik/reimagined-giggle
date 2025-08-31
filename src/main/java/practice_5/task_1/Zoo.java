package practice_5.task_1;

public class Zoo {
    private Animal animal;

    public void addAnimal(Animal animal) {
        this.animal = animal;
        System.out.println("Животное " + animal + " добавлено в зоопарк.");
    }

    public void forceMakeSound() {
        this.animal.makeSound();
    }

    public void forceMakeMove() {
        this.animal.makeMove();
    }

    public void removeAnimal() {
        System.out.println("Животное " + animal + " удалено из зоопарка.");
        this.animal = null;
    }
}
