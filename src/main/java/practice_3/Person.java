package practice_3;

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;

    public Person(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public void setLastName(String name) {
        this.lastName = name;
    }

    public void printPersonInfo() {
        System.out.println("Имя: " + firstName + ", фамилия: " + lastName + ", SSN: " + ssn);
    }
}
