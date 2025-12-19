package Reshebnik;

public class Demo {
    static String type = "STATIC";
    String type2 = "INSTANCE";

    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();

        d1.type = "CHANGED";
        d2.type2 = "UPDATED";

        System.out.println(d1.type);
        System.out.println(d2.type);
        System.out.println(d1.type2);
        System.out.println(d2.type2);
    }
}
