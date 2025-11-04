package Reshebnik;

public class Person {
    String firstName;
    String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void getFullName() {
        System.out.println(firstName + " " + lastName);
    }

    public static void main(String[] args) {
        Person first = new Person("Afanasiy", "Akopyan");

        first.getFullName();
    }
}
