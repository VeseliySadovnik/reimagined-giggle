package practice_5.task_8;

public class Main {
    public static void main(String[] args) {
        Museum museum = new Museum();

        museum.addExhibit(new Manuscript());
        museum.showExhibitInfo();

        museum.addExhibit(new Sculpture());
        museum.showExhibitInfo();
    }
}
