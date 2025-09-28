package practice_8.part1;

@FunctionalInterface
public interface MathOperation {
    double operate(double a, double b);

    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        System.out.println("Результат сложения: " + addition.operate(5, 8));

        MathOperation substruct = (a, b) -> a - b;
        System.out.println("Результат вычитания: " + substruct.operate(18, 9));

        MathOperation multiply = (a, b) -> a * b;
        System.out.println("Результат умножения: " + multiply.operate(9, 9));

        MathOperation divide = (a, b) -> a / b;
        System.out.println("Результат деления: " + divide.operate(28, 4));
    }
}
