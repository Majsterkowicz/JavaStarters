package collections;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static collections.ShapeType.*;

public class ShapeFactory {

    public static List<Shape> provideShapes() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(2.0));
        shapes.add(new Circle(4.0));
        shapes.add(new Circle(3.0));
        shapes.add(new Circle(1.0));
        shapes.add(new Circle(5.0));
        return shapes;
    }
}
