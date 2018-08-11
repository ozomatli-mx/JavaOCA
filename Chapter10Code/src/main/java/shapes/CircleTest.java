package shapes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class CircleTest {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(11.4));
        shapes.add(new Circle(12.1));
        shapes.add(new Square(10));
        shapes.add(new Square(8));
        for (Shape shape : shapes) {
            System.out.println("Result: " + shape.getArea());
        }
    }
}
