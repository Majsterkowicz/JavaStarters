package collections;

import java.util.*;

import static collections.ShapeType.*;

class CustomComparator implements Comparator<Shape> {

    @Override
    public int compare(Shape shape1, Shape shape2) {
        return Double.compare(shape1.getShapeArea(), shape2.getShapeArea());
//
//        double differential = shape1.getShapeArea() - (shape2.getShapeArea());
//        if (differential > 0) {
//            return 1;
//        } else if (differential == 0) {
//            return 0;
//        }
//        return -1;
    }
}

public class ShapeCalculator {

    private static final List<ShapeType> SHAPE_TYPE_LIST = Arrays.asList(
            CIRCLE, TRIANGLE, SQUARE, RECTANGLE, PENTAGON, HEXAGON);

    public static void main(String[] args) {
//        List<Shape> listOfShapes = createListOfShapes();
        System.out.println("PRZED SORTOWANIEM");
        List<Shape> listOfShapes = ShapeFactory.provideShapes();
        showShapesDetails(listOfShapes);
        System.out.println("POSORTOWANE");
        List<Shape> sortedByShapeArea = sortShapesByArea(listOfShapes);
        sortedByShapeArea.forEach(System.out::println);

//        List<Shape> theBiggestShapes = findTheBiggestShape(listOfShapes);
//        System.out.println(theBiggestShapes.toString());


    }

    private static void showShapesDetails(List<Shape> listOfShapes) {
        for (Shape shape : listOfShapes) {
            System.out.println(shape.toString());
        }
    }

    private static List<Shape> sortShapesByArea(List<Shape> listOfShapes) {
//        listOfShapes.sort(Comparator.comparing(Shape::getShapeArea));
        listOfShapes.sort(new CustomComparator().reversed());
        return listOfShapes;
    }

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