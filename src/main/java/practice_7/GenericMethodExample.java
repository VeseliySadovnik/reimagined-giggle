package practice_7;

public class GenericMethodExample {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        printArray(intArray);

        String[] stringArray = {"Hello", "World", "Generics"};
        printArray(stringArray);

        Double[] doubleArray = {1.5, 2.5, 3.5};
        printArray(doubleArray);
    }

    public static <T> void printArray(T[] array) {

        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
