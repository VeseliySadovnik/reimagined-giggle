package practice_3;

public class UniversityMain {
    public static void main(String[] args) {
        University st1 = new University(101, "Анна");
        University st2 = new University(102, "Анастасия");
        University st3 = new University(103, "Мария");
        st1.printStudentInfo();
        st2.printStudentInfo();
        st3.printStudentInfo();

        University.changeUniversityName("МГИМО");

        st1.printStudentInfo();
        st2.printStudentInfo();
        st3.printStudentInfo();
    }
}
