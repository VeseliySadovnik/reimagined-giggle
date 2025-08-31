package practice_5.task_7;

public class RollerCoaster extends Attraction {
    @Override
    void showInfo() {
        System.out.println("Острые ощущения!");
    }

    @Override
    void showMaintain() {
        System.out.println("Требуется проверка безопасности!");
    }
}
