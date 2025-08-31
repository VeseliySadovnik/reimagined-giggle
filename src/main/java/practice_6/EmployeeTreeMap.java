package practice_6;
import java.util.TreeMap;

public class EmployeeTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> employees = new TreeMap<>();

        employees.put(100, "Андрей");
        employees.put(200, "Михаил");
        employees.put(300, "Катерина");
        employees.put(400, "Елена");

        int searchID = 500;

        Integer higherID = employees.higherKey(searchID);

        if (higherID != null) {
            System.out.println("Ближайший больший ID к " + searchID + ": " + higherID + " (" + employees.get(higherID) + ")");
        } else {
            System.out.println("Более высокого ID, чем " + searchID + ", нет.");
        }
    }
}
