package practice_2;

import practice_3.Company;

public class Main {
    public static void main(String[] args) {
        // Класс Car
        Car car = new Car("Volvo", 2020);
        car.setYear(2021);
        car.print();

        // Класс Rectangle
        Rectangle rectangle = new Rectangle(12, 16);
        rectangle.setWidth(14);
        rectangle.print();

        // Класс Book
        Book book = new Book("Война и мир", "Достоевский");
        book.setAuthor("Толстой");
        book.print();

        // Класс BankAccount
        BankAccount account = new BankAccount("Мария", 0);
        account.deposit(10000);
        account.withdraw(12000);
        account.printBalance();

        // Класс Point
        Point point = new Point(3, 5);
        point.setX(10);
        point.print();

        // Класс StudentGroup
        StudentGroup group = new StudentGroup("Зайки", 27);
        group.setStudentCount(17);
        group.print();

        // Класс Circle
        Circle circle = new Circle(5.0);
        circle.setRadius(7.5);
        System.out.println("Площадь круга " + circle.calculateArea());
        System.out.println("Длина окружности " + circle.calculateCircumference());

        // Класс Teacher
        Teacher teacher = new Teacher("Михаил Иванович", "математическая статистика");
        teacher.setSubject("физкультура");
        teacher.print();

        // Класс Product
        Product product = new Product("Консультация по маркетингу", 100000.123);
        product.setPrice(1000000.0);
        product.applyDiscount(12000.0);
        product.print();

        // Класс Laptop
        Laptop laptop = new Laptop("Lenovo", 3762223.7567);
        laptop.setPrice(1234567.890);
        laptop.printInfo();
    }
}

