package practice_2;

public class Book {
    String title;
    String author;

    Book(String Title, String Author) {
        this.title = Title;
        this.author = Author;
    }

    String getTitle() { return this.title; }

    String getAuthor() { return this.author; }

    void setTitle(String newTitle) { this.title = newTitle; }

    void setAuthor(String newAuthor) { this.author = newAuthor; }

    public String printInfo() { return title + author;}

    void print() {System.out.println("Название книги: " + title + ", автор книги: " + author);}

}
