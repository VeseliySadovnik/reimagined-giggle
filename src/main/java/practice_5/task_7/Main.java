package practice_5.task_7;

public class Main {
    public static void main(String[] args) {
        AmusementPark park = new AmusementPark();

        park.addAttraction(new RollerCoaster());
        park.showInfo();
        park.showMaintain();

        park.addAttraction(new Carousel());
        park.showInfo();
        park.showMaintain();
    }
}
