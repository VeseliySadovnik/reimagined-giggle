package practice_2;

public class Car {
    String brand;
    int year;

    public Car(String Brand, int Year) {
        this.brand = Brand;
        this.year = Year;
    }

    String getBrand() {
        return this.brand;
    }

    int getYear() {
        return this.year;
    }

    void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    void setYear(int newYear) {
        this.year = newYear;
    }

    void print() {
        System.out.println("Бренд автомобиля " + this.brand + ", год выпуска автомобиля " + this.year);
    }
}
