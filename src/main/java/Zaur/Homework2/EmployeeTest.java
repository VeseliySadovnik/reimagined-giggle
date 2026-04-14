package Zaur.Homework2;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee Anna = new Employee();
        Employee Mariia = new Employee();

        Anna.surname = "Анна Жилова";
        Mariia.surname = "Мария Жилова";

        Anna.salary = 120000.00;
        Mariia.salary = 160000.00;

        Anna.doubleSalary();
        Mariia.doubleSalary();
    }
}
