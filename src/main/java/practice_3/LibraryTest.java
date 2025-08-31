package practice_3;

public class LibraryTest {
    public static void main(String[] args) {
        Library book = new Library();
        book.setBookTitle("1984");
        book.setAuthor("George Orwell");
        book.setYear(1949);
        book.setCategory("Утопия");
        System.out.println(book.getBookTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getYear());
        System.out.println(book.getCategory());
    }
}
