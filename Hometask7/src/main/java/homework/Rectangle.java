package homework;

public class Rectangle {
    Double width;
    Double height;

    Rectangle() {
        width = 10.5;
        height = 15.0;
    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculatePerimeter() {
        return (this.width + this.height) * 2;
    }

    public double calculateSquare() {
        return this.width * this.height;
    }
}
