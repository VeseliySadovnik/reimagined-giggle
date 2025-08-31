package practice_5.task_8;

public class Museum {
    private Exhibit exhibit;

    public void addExhibit(Exhibit exhibit) {
        this.exhibit = exhibit;
        System.out.println("Новый экспонат добавлен в музей.");
    }

    public void showExhibitInfo() {
        exhibit.describe();
        exhibit.preserve();
    }
}
