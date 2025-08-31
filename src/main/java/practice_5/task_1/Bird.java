package practice_5.task_1;

public class Bird extends Animal {

    @Override
    void makeSound() {
        System.out.println("Чирик чик-чик");
    }

    @Override
    void makeMove() {
        System.out.println("Летает");
    }
}
