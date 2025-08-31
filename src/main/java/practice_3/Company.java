package practice_3;

public class Company {
    static String companyName = "Банк России";
    final int employeeID;
    String employeeName;

    public Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }
    public static void printCompanyName() {
        System.out.println("Название компании: " + companyName);
    }
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public void printEmployeeInfo() {
        System.out.println("ID сотрудника: " + employeeID + ", имя сотрудника: " + employeeName + ", название компании: " + companyName);
    }
}