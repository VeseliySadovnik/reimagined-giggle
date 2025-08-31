package practice_5.task_3;

public class RestaurantMenu {
    private Dish dish;

    public void addDish(Dish dish) {
        this.dish = dish;
        System.out.println("Блюдо добавлено в меню");
    }

    public void showCharacteristics() {
        this.dish.showCharacteristics();
        System.out.println("Характеристики показаны");
    }
}
