package practice_3;

public class CompanyMain {
    public static void main(String[] args) {
        Company emp1 = new Company(1, "Анна");
        Company emp2 = new Company(2, "Анастасия");

        emp1.printEmployeeInfo();
        emp2.printEmployeeInfo();

        Company.companyName = "Банк Испании";
        Company.printCompanyName();

        emp1.printEmployeeInfo();
        emp2.printEmployeeInfo();

        //emp1.employeeID = 100;
    }
}