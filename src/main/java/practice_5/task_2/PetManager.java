package practice_5.task_2;

public class PetManager {
    private Pet pet;

    public void addPet(Pet pet) {
        this.pet = pet;
        System.out.println("Питомец " + pet + " добавлен.");
    }

    public void feedPet() {
        this.pet.eat();
        System.out.println("Вы покормили питомца");
    }

    public void forcePetToPlay() {
        if (this.pet instanceof Playable) {
            Playable playablePet = (Playable) this.pet;
            playablePet.play();
        } else {
            System.out.println("Ошибка! Животное не играет!");
        }
    }

    public void forcePetToWalk() {
        if (this.pet instanceof Walkable) {
            Walkable walkablePet = (Walkable) this.pet;
            walkablePet.walk();
        } else {
            System.out.println("Ошибка! Животное не гуляет!");
        }
    }
}


