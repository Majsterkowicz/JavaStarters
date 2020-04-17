package collections;

import java.util.*;

import static collections.ShapeType.*;

abstract class customComparator implements Comparator<Shape> {

    public int compare(Shape shape1, Shape shape2) {
        double differential = shape1.getShapeArea() - (shape2.getShapeArea());
        if (differential > 0) {
            return -1;
        } else if (differential == 0) {
            return 0;
        }
        return 1;
    }
}

public class ShapeCalculator {

    private static final List<ShapeType> SHAPE_TYPE_LIST = Arrays.asList(
            CIRCLE, TRIANGLE, SQUARE, RECTANGLE, PENTAGON, HEXAGON);

    public static void main(String[] args) {

        List<Shape> listOfShapes = createListOfShapes();
        showShapesDetails(listOfShapes);
//        List<Shape> sortedByShapeArea = sortShapesByArea(listOfShapes);
        List<Shape> theBiggestShapes = findTheBiggestShape(listOfShapes);
        System.out.println(theBiggestShapes.toString());


    }

    private static List<Shape> createListOfShapes() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(createCircle());
        shapes.add(createCircle2());
        shapes.add(createSquare());
        shapes.add(createSquare2());
        shapes.add(createTriangle());
        shapes.add(createTriangle2());
        shapes.add(createRectangle());
        shapes.add(createRectangle2());
        shapes.add(createPentagon());
        shapes.add(createPentagon2());
        shapes.add(createHexagon());
        shapes.add(createHexagon2());
        return shapes;
    }

    private static Shape createCircle() {
        Map<String, Double> circleShapeParameters = Map.of("radius", 4.0);
        return new Circle(CIRCLE, circleShapeParameters);
    }

    private static Shape createCircle2() {
        Map<String, Double> circleShapeParameters = Map.of("radius", 6.0);
        return new Circle(CIRCLE, circleShapeParameters);
    }

    private static Shape createSquare() {
        Map<String, Double> squareShapeParameters = Map.of("side", 12.0);
        return new Square(SQUARE, squareShapeParameters);
    }

    private static Shape createSquare2() {
        Map<String, Double> squareShapeParameters = Map.of("side", 11.50);
        return new Square(SQUARE, squareShapeParameters);
    }

    private static Shape createTriangle() {
        Map<String, Double> triangleShapeParameters = Map.of("base", 4.0, "height", 6.50);
        return new Triangle(TRIANGLE, triangleShapeParameters);
    }

    private static Shape createTriangle2() {
        Map<String, Double> triangleShapeParameters = Map.of("base", 3.0, "height", 5.0);
        return new Triangle(TRIANGLE, triangleShapeParameters);
    }

    private static Shape createRectangle() {
        Map<String, Double> rectangleShapeParameters = Map.of("side1", 3.0, "side2", 5.0);
        return new Rectangle(RECTANGLE, rectangleShapeParameters);
    }

    private static Shape createRectangle2() {
        Map<String, Double> rectangleShapeParameters = Map.of("side1", 4.0, "side2", 7.0);
        return new Rectangle(RECTANGLE, rectangleShapeParameters);
    }

    private static Shape createPentagon() {
        Map<String, Double> pentagonShapeParameters = Map.of("side", 5.0);
        return new Pentagon(PENTAGON, pentagonShapeParameters);
    }

    private static Shape createPentagon2() {
        Map<String, Double> pentagonShapeParameters = Map.of("side", 7.0);
        return new Pentagon(PENTAGON, pentagonShapeParameters);
    }

    private static Shape createHexagon() {
        Map<String, Double> hexagonShapeParameters = Map.of("side", 5.0);
        return new Hexagon(HEXAGON, hexagonShapeParameters);
    }

    private static Shape createHexagon2() {
        Map<String, Double> hexagonShapeParameters = Map.of("side", 6.20);
        return new Hexagon(HEXAGON, hexagonShapeParameters);
    }

    private static void showShapesDetails(List<Shape> listOfShapes) {
        for (Shape shape : listOfShapes) {
            System.out.println(shape.toString());
        }
    }

    /*private static List<Shape> sortShapesByArea(List<Shape> listOfShapes) {
        listOfShapes.sort(customComparator);
//        sortedShapesByArea.sort();
    }*/

    private static List<Shape> findTheBiggestShape(List<Shape> listOfShapes) {
        Shape theBiggestShape = null;
        List<Shape> theBiggestShapes = new ArrayList<>();
        for (Shape shape : listOfShapes) {

            if (theBiggestShape == null) {
                theBiggestShape = shape;
                theBiggestShapes.add(shape);
            } else if (shape.getShapeArea() == theBiggestShape.getShapeArea()) {
                theBiggestShapes.add(shape);
            } else if (shape.getShapeArea() < theBiggestShape.getShapeArea()) {
                break;
            }
        }
        return theBiggestShapes;
    }
}