package practice_5.task_1;

public class Main {
    public static void main(String[] args) {
        Zoo zooOfVoronezh = new Zoo();

        Bird titbit = new Bird();
        zooOfVoronezh.addAnimal(titbit);
        zooOfVoronezh.forceMakeMove();
        zooOfVoronezh.forceMakeSound();

        Elephant africanElephant = new Elephant();
        zooOfVoronezh.removeAnimal();
        zooOfVoronezh.addAnimal(africanElephant);
        zooOfVoronezh.forceMakeMove();
        zooOfVoronezh.forceMakeSound();
    }
}
