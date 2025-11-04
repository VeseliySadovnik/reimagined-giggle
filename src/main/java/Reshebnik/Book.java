package Reshebnik;

public class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void printInfo() {
        System.out.println("Название книги: " + title + ", автор книги: " + author);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Война и мир", "Лев Толстой");

        book1.printInfo();
    }
}
