package complex_tasks.task3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GradeServiceTest {

    @Test
    void testAddValidGrade() {
        GradeService<Integer> service = new GradeService<>();
        service.addGrade(new StudentGrade<>("Ivan", "Math", 90));
        assertEquals(1, service.getAllGrades().size());
    }

    @Test
    void testAddInvalidGrade() {
        GradeService<Integer> service = new GradeService<>();
        assertThrows(InvalidGradeException.class, () ->
                service.addGrade(new StudentGrade<>("Anna", "Biology", -10)));
    }

    @Test
    void testAverageGrade() {
        GradeService<Double> service = new GradeService<>();
        service.addGrade(new StudentGrade<>("A", "Physics", 70.0));
        service.addGrade(new StudentGrade<>("B", "Physics", 90.0));
        double avg = service.getAverageBySubject("Physics");
        assertEquals(80.0, avg);
    }

    @Test
    void testAverageGradeNoSubject() {
        GradeService<Integer> service = new GradeService<>();
        service.addGrade(new StudentGrade<>("X", "History", 75));
        assertThrows(IllegalArgumentException.class, () ->
                service.getAverageBySubject("Geography"));
}
}

