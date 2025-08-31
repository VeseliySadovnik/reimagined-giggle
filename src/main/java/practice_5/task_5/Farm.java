package practice_5.task_5;

public class Farm {
    private FarmAnimal farmAnimal;

    public void addFarmAnimal(FarmAnimal farmAnimal) {
        this.farmAnimal = farmAnimal;
        System.out.println("Лог: животное добавлено на ферму.");
    }

    public void showFeed() {
        this.farmAnimal.showFeed();
        System.out.println("Лог: вот чем питается животное.");
    }

    public void showCare() {
        this.farmAnimal.showCare();
        System.out.println("Лог: вот что необходимо животному.");
    }

    public void showProduce() {
        this.farmAnimal.showProduce();
        System.out.println("Лог: вот что производит животное.");
    }

    public void removeFarmAnimal() {
        System.out.println("Животное удалено с фермы.");
        this.farmAnimal = null;
    }
}
