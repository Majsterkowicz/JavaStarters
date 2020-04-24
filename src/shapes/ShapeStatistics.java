package shapes;

import java.util.*;

import static shapes.ShapeGroup.*;

public class ShapeStatistics {

    private static final List<ShapeGroup> SHAPE_TYPE_LIST = Arrays.asList(
            CIRCLE, TRIANGLE, RECTANGLE, REGULAR_POLYGON);

    public static void main(String[] args) {

        System.out.println("PRZED SORTOWANIEM");
        List<Shape> listOfShapes = ShapeFactory.provideShapes();
        showShapesDetails(listOfShapes);
        System.out.println("POSORTOWANE");
        List<Shape> sortedByShapeArea = sortShapesByArea(ShapeFactory.provideShapes());
        showShapesDetails(sortedByShapeArea);
        List<Shape> theBiggestShapes = findTheBiggestShape(listOfShapes);
//        System.out.println(theBiggestShapes.toString());
        showShapesDetails(theBiggestShapes);
        Map<ShapeGroup, Integer> numberOfShapesInGroups = countNumberOfShapesInGroup(ShapeFactory.provideShapes());
        System.out.println("Each shape group contains: " + numberOfShapesInGroups);
        Map<ShapeGroup, Double> totalShapesAreaByGroup = sumAreasOfShapesByGroup(ShapeFactory.provideShapes());
        System.out.println("Total shapes areas in each group: " + totalShapesAreaByGroup);
    }

    private static void showShapesDetails(List<Shape> listOfShapes) {
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
    }

    private static Map<ShapeGroup,Integer> countNumberOfShapesInGroup(List<Shape> provideShapes) {
        Map<ShapeGroup, Integer> numberOfShapesInGroup = new HashMap<>();
        int counter = 0;
        for (ShapeGroup shapeEnum : SHAPE_TYPE_LIST){
            for (Shape shape : provideShapes){
                if (shape.getShapeGroup().equals(shapeEnum)){
                    counter ++;
                }
            }
            numberOfShapesInGroup.put(shapeEnum, counter);
        }
        return numberOfShapesInGroup;
    }

    private static Map<ShapeGroup, Double> sumAreasOfShapesByGroup(List<Shape> provideShapes) {
        Map<ShapeGroup, Double> totalAreaInGroup = new HashMap<>();
        double counter = 0.0;
        for (ShapeGroup shapeEnum : SHAPE_TYPE_LIST){
            for (Shape shape : provideShapes){
                counter = counter + shape.getShapeArea();
            }
            totalAreaInGroup.put(shapeEnum, counter);
        }
        return totalAreaInGroup;
    }
}