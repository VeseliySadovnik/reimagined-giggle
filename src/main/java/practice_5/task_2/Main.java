package practice_5.task_2;

public class Main {
    public static void main(String[] args) {
        Cat Musya = new Cat();

        PetManager petManager = new PetManager();
        petManager.addPet(Musya);
        petManager.feedPet();
        petManager.forcePetToWalk();
        petManager.forcePetToPlay();

        petManager.addPet(new Dog());
        petManager.feedPet();
        petManager.forcePetToPlay();
        petManager.forcePetToWalk();
    }
}
