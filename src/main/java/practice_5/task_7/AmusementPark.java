package practice_5.task_7;

public class AmusementPark {
    private Attraction attraction;

    public void addAttraction(Attraction attraction) {
        this.attraction = attraction;
        System.out.println("Новый аттракцион готов к работе!");
    }

    public void showInfo() {
        this.attraction.showInfo();
        System.out.println("Информация об аттракционе доступна посетителям.");
    }

    public void showMaintain() {
        this.attraction.showMaintain();
        System.out.println("Информация об обслуживании аттракциона доступна техническому специалисту.");
    }
}
