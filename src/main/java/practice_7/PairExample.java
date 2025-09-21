package practice_7;

public class PairExample {
    public static void main(String[] args) {
        Pair<String, Integer> student = new Pair<>("Maria", 35);
        System.out.println("Student's name: " + student.getFirst());
        System.out.println("Student's age: " + student.getSecond());

        Pair<Integer, Double> product = new Pair<>(101, 99.99);
        System.out.println("ID: " + product.getFirst());
        System.out.println("Price: " + product.getSecond());

        student.setFirst("Ivan");
        student.setSecond(28);
        System.out.println("New student: " + student.getFirst() + ", " + student.getSecond());
    }
}
        class Pair<T, U> {
            private T first;
            private U second;

            public Pair(T first, U second) {
                this.first = first;
                this.second = second;
            }

            public void setFirst(T first) {
                this.first = first;
            }

            public T getFirst() {
                return first;
            }

            public void setSecond(U second) {
                this.second = second;
            }

            public U getSecond() {
                return second;
            }
        }

