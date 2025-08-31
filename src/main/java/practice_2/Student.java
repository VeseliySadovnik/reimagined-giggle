package practice_2;

public class Student {
    int age;
    String name;

    Student(int someAge, String someName) {
        this.age = someAge;
        this.name = someName;
    }

    int getAge() {
        return this.age;
    }

    String getName() {
        return this.name;
    }

    void setAge(int newAge) {
        this.age = newAge;
    }

    void setName(String newName) {
        this.name = newName;
    }

    void print() {
        System.out.println("Возраст " + this.age + ", имя " + this.name);
    }
}
