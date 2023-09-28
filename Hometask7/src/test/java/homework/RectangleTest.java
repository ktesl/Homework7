package homework;

import org.testng.annotations.Test;

public class RectangleTest {
    @Test
    public void Perimeter() {
        Rectangle rectangle = new Rectangle();
        double perimeter = (rectangle.width + rectangle.height) * 2;
        System.out.println("Perimeter of a rectangle = " + perimeter);
    }

    @Test
    public void Square() {
        Rectangle rectangle = new Rectangle(20, 5);
        double square = rectangle.width * rectangle.height;
        System.out.println("Square of a rectangle = " + square);
    }
}
