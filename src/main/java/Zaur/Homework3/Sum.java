package Zaur.Homework3;

public class Sum {
    int sum() {
        return 0;
    }

    int sum(int a) {
        return a;
    }

    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        Sum summa = new Sum();
        System.out.println(summa.sum());
        System.out.println(summa.sum(1));
        System.out.println(summa.sum(1, 2));
        System.out.println(summa.sum(1, 2, 3));
        System.out.println(summa.sum(1, 2, 3, 4));
    }
}
