package practice_3;

public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person("Bob", "Dylan", "1111");
        Person p2 = new Person("Bob", "Marley", "1234");

        p1.setFirstName("Mark");

        p1.printPersonInfo();
        p2.printPersonInfo();
    }
}
