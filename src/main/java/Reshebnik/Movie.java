package Reshebnik;

public class Movie {
    String name;
    int year;

    Movie(String name, int year) {
        this.name = name;
        this.year = year;
    }

    String getName() {
        return this.name;
    }

    int getYear() {
        return this.year;
    }

    public void describe() {
        System.out.println("Фильм " + name + " вышел в " + year + " году.");
    }

    public static void main(String[] args) {
        Movie movie1 = new Movie("Some film", 1991);

        System.out.println(movie1.getName());
        System.out.println(movie1.getYear());

        movie1.describe();
    }
}
