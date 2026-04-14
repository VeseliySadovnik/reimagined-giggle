package Zaur.Homework1;

public class StudentTest {

    double averageMark(Student st) {
        double avMark = (st.mathAverageGrade + st.economicsAverageGrade + st.englishAverageGrade) / 3;
        System.out.println(avMark);
        return avMark;
    }

    public static void main(String[] args) {

    Student st1 = new Student();
    st1.studentId = 1;
    st1.name = "Petr";
    st1.surname = "Petrov";
    st1.course = 3;
    st1.mathAverageGrade = 7.8;
    st1.economicsAverageGrade = 9.2;
    st1.englishAverageGrade = 8.8;

    Student st2 = new Student(2, "Ivan", "Ivanov", 1);
    st2.mathAverageGrade = 6.3;
    st2.economicsAverageGrade = 7;
    st2.englishAverageGrade = 3.5;

    Student st3 = new Student(3, "Anton", "Antonov", 4, 9.1, 9, 10);

    StudentTest stTest = new StudentTest();
    stTest.averageMark(st1);
    stTest.averageMark(st2);
    stTest.averageMark(st3);
    }
}