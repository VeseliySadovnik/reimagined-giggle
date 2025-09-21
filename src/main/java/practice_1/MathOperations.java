package practice_1;

public class MathOperations {
    public static int add(int x, int y) { //создаю метод в классе
        return x + y; //указываю, что метод должен возвращать сумму x и y
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        return (x / (double)y);
    }

    public static void main(String[] args) {
        int addResult = add(7, 9); //создаю переменную addResult, в которой хранится значение метода add
        System.out.println("Сумма двух чисел: " + addResult); //вывожу в консоль результат сложения двух чисел

        int subResult = subtract(12, 10);
        System.out.println("Разность двух чисел: " + subResult);

        int multResult = multiply(4, 9);
        System.out.println("Произведение двух чисел равно: " + multResult);

        double divResult = divide(9, 3);
        System.out.println("Результат деления двух чисел: " + divResult);
    }

}
