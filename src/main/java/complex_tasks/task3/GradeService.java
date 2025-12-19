package complex_tasks.task3;
import java.util.List;
import java.util.ArrayList;

public class GradeService<T extends Number> {
    private final List<StudentGrade<T>> grades = new ArrayList<>();

    public synchronized void addGrade(StudentGrade<T> grade) {
        if (grade.getGrade().doubleValue() < 0) {
            throw new InvalidGradeException("Оценка не может быть отрицательной");
        }
        grades.add(grade);
    }

    public synchronized double getAverageBySubject(String subject) {
        return grades.stream()
                .filter(g -> g.getSubject().equalsIgnoreCase(subject))
                .mapToDouble(g -> g.getGrade().doubleValue())
                .average()
                .orElseThrow(() -> new
                        IllegalArgumentException("Нет оценок по предмету: " + subject));
    }

    public List<StudentGrade<T>> getAllGrades() {
        return List.copyOf(grades);
    }
}
