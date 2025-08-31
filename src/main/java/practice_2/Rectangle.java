package practice_2;

public class Rectangle {
    int width;
    int height;

    Rectangle(int Width, int Height) {
        this.width = Width;
        this.height = Height;
    }

    int getWidth() {
        return width;
        }

    int getHeight() {
        return height;
        }

    void setWidth(int width) {
        this.width = width;
    }

    public int calculateArea() {
        return width * height;
    }

    void print() {
        System.out.println("Площадь прямоугольника равна " + calculateArea());
    }
}
