package practice_5.task_3;

public class Main {
    public static void main(String[] args) {
        RestaurantMenu menu = new RestaurantMenu();

        MainCourse steak = new MainCourse(210);
        menu.addDish(steak);
        menu.showCharacteristics();

        Drink vodka = new Drink(100);
        menu.addDish(vodka);
        menu.showCharacteristics();
    }
}
