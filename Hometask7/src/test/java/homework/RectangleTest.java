package homework;

import org.testng.annotations.Test;

public class RectangleTest {
    @Test
    public void perimeter() {
        Rectangle rectangle = new Rectangle();
        System.out.println("Perimeter of a rectangle = " + rectangle.calculatePerimeter());
    }

    @Test
    public void square() {
        Rectangle rectangle = new Rectangle(20, 5);
        System.out.println("Square of a rectangle = " + rectangle.calculateSquare());
    }
}
