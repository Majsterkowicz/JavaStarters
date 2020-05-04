package shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapeFactory {

    public static List<Shape> providedShapes() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(2.0));
        shapes.add(new Circle(4.0));
        shapes.add(new Circle(3.0));
        shapes.add(new Circle(1.0));
        shapes.add(new Circle(5.0));
        shapes.add(new Rectangle(5.0, 6.2));
        shapes.add(new Rectangle(2.4, 4.4));
        shapes.add(new Rectangle(3.2, 3.2));
        shapes.add(new Rectangle(7.0, 5.1));
        shapes.add(new Rectangle(5.0, 8.0));
        shapes.add(new Rectangle(4.0, 4.0));
        shapes.add(new Triangle(2.0, 6.5));
        shapes.add(new Triangle(6, 10));
        shapes.add(new Triangle(3.3, 4.4));
        shapes.add(new Triangle(-5.0, 4.2));
        shapes.add(new Triangle(Math.sqrt(2), Math.sqrt(3)));
        shapes.add(new Triangle(Math.PI, Math.E));
        shapes.add(new RegularPolygon(7,4));
        shapes.add(new RegularPolygon(5,3));
        shapes.add(new RegularPolygon(6,5));
        shapes.add(new RegularPolygon(5,6));
        shapes.add(new RegularPolygon(6,8));
        shapes.add(new RegularPolygon(6,2));
        return shapes;
    }
}
