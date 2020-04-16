package collections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static collections.ShapeType.*;

public class ShapeCalculator {

    private static final List<ShapeType> SHAPE_TYPE_LIST = Arrays.asList(
            CIRCLE, TRIANGLE, SQUARE, RECTANGLE, PENTAGON, HEXAGON);

    public static void main(String[] args) {

        Map<String, Double> circleShapeParameters = Map.of("radius", 4.0);
        Shape circle = new Circle(CIRCLE, circleShapeParameters);

        System.out.println(circle.calculateArea(circleShapeParameters));

        Map<String, Double> squareShapeParameters = Map.of("side", 12.0);
        Shape square = new Square(SQUARE, squareShapeParameters);

        System.out.println(square.calculateArea(squareShapeParameters));

    }
}
