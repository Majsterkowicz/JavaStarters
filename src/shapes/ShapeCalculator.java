package shapes;

import java.util.*;

import static shapes.ShapeGroup.*;

public class ShapeCalculator {

    private static final List<ShapeGroup> SHAPE_TYPE_LIST = Arrays.asList(
            CIRCLE, TRIANGLE, RECTANGLE, REGULAR_POLYGON);

    public static void main(String[] args) {
//        List<Shape> listOfShapes = createListOfShapes();
        System.out.println("PRZED SORTOWANIEM");
        List<Shape> listOfShapes = ShapeFactory.provideShapes();
       /* showShapesDetails(listOfShapes);
        System.out.println("POSORTOWANE");
        List<Shape> sortedByShapeArea = sortShapesByArea(listOfShapes);
        showShapesDetails(sortedByShapeArea);
        System.out.println("The biggest shape area is:");
        showShapesDetails(findTheBiggestShape(sortedByShapeArea));*/
//        sortedByShapeArea.forEach(System.out::println);

//        List<Shape> theBiggestShapes = findTheBiggestShape(listOfShapes);
//        System.out.println(theBiggestShapes.toString());
    }

    /*private static void showShapesDetails(List<Shape> listOfShapes) {
        for (Shape shape : listOfShapes) {
            System.out.println(shape.printShapeData());
        }
    }

    private static List<Shape> sortShapesByArea(List<Shape> listOfShapes) {
//        listOfShapes.sort(Comparator.comparing(Shape::getShapeArea));
        listOfShapes.sort(new CustomShapeComparator().reversed());
        return listOfShapes;
    }

    private static List<Shape> findTheBiggestShape(List<Shape> listOfShapes) {
        Shape theBiggestShape = null;
        List<Shape> theBiggestShapes = new ArrayList<>();
        for (Shape shape : listOfShapes) {

            if (theBiggestShape == null) {
                theBiggestShape = shape;
                theBiggestShapes.add(shape);
            } else if (shape.getShapeArea().equals(theBiggestShape.getShapeArea())) {
                theBiggestShapes.add(shape);
            } else if (shape.getShapeArea() < theBiggestShape.getShapeArea()) {
                break;
            }
        }
        return theBiggestShapes;
    }*/
}