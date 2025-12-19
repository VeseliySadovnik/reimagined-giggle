package Reshebnik;

public class Task7 {
    static class Parent {
        public String name = "parent";
        public String getName() { return name; }
    }

    static class Child extends Parent {
        public String name = "child";
        public String getName() { return name; }
    }

    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println(p.name);
        System.out.println(p.getName());
    }
}
