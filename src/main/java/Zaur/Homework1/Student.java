package Zaur.Homework1;

public class Student {

    public Student(int studentId2, String name2, String surname2, int course2, double mathAverageGrade2,
                   double economicsAverageGrade2, double englishAverageGrade2) {
        studentId = studentId2;
        name = name2;
        surname = surname2;
        course = course2;
        mathAverageGrade = mathAverageGrade2;
        economicsAverageGrade = economicsAverageGrade2;
        englishAverageGrade = englishAverageGrade2;
    }

    Student(int studentId3, String name3, String surname3, int course3) {
        this(studentId3, name3, surname3, course3, 0, 0, 0);
    }

    Student() {
    }

    int studentId;
    String name;
    String surname;
    int course;
    double mathAverageGrade;
    double economicsAverageGrade;
    double englishAverageGrade;
    int result;
}