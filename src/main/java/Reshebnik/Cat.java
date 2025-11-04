package Reshebnik;

public class Cat {
    String name;
    int age;

    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void meow() {
        System.out.println("Кошка " + name + " мяукает.");
    }

    public void sleep() {
        System.out.println("Кошка " + name + " спит.");
    }

    public static void main(String[] args) {
        Cat kitty = new Cat("Sheyla", 8);

        kitty.meow();
        kitty.sleep();
    }
}
