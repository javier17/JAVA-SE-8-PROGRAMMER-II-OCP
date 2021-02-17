package mx.com.hittechs.shape.test;

import java.util.ArrayList;
import java.util.List;
import mx.com.hittechs.shape.Circle;
import mx.com.hittechs.shape.Shape;
import mx.com.hittechs.shape.Square;

/**
 * @author Hittechs Training & Consulting
 * @web www.hittechs.com.mx
 * @mail contacto@hittechs.com.mx
 */
public class ShapeTest {

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
