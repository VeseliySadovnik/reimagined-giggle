package practice_7;

public class BoxExample {

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.set(10);
        System.out.println("Integer value: " + integerBox.get());

        Box<String> stringBox = new Box<>();
        stringBox.set("Hello");
        System.out.println("String value: " + stringBox.get());

    }
}
    class Box<T> {
        private T item;

        public void set(T item) {
            this.item = item;
        }

        public T get() {
        return item;
        }

    }

