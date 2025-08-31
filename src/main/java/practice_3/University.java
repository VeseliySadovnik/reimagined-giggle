package practice_3;

public class University {
    static String universityName = "МГУ";
    final int studentID;
    String studentName;

    public University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }
    public static void changeUniversityName(String newName) {
        universityName = newName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void printStudentInfo() {
        System.out.println("ID студента: " + studentID + ", имя студента: " + studentName + ", название университета: " + universityName);
    }
}
