package Zaur.Homework2;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    void doubleSalary() {
        salary *= 2;
        System.out.println("Новая зарплата сотрудника " + surname + " равна " + salary);
    }
}
