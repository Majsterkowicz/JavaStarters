package shapes;

import java.util.*;

import static shapes.ShapeGroup.*;

public class ShapeStatistics {

    private static final List<ShapeGroup> SHAPE_TYPE_LIST = Arrays.asList(
            CIRCLE, TRIANGLE, RECTANGLE, REGULAR_POLYGON); //TODO przerobić na SET

    public static void main(String[] args) {

        System.out.println("PRZED SORTOWANIEM");
        List<Shape> listOfShapes = ShapeFactory.provideShapes(); //TODO ewentualnie zmiana na SET
        showShapesDetails(listOfShapes);
        System.out.println("POSORTOWANE");
        List<Shape> sortedByShapeArea = sortShapesByArea(listOfShapes);
        showShapesDetails(sortedByShapeArea);
        List<Shape> theBiggestShapes = findFirstBigShape(sortedByShapeArea);
//        System.out.println(theBiggestShapes.toString());
        showShapesDetails(theBiggestShapes);
        //TODO Mapa <ShapeGroup, Lista kształtów)
        Map<ShapeGroup, Integer> numberOfShapesInGroups = countNumberOfShapesInGroup(listOfShapes); //TODO zmienić privided shapes
        System.out.println("Each shape group contains: " + numberOfShapesInGroups);
        Map<ShapeGroup, Double> totalShapesAreaByGroup = sumAreasOfShapesInGroup(ShapeFactory.provideShapes());
        System.out.println("Total shapes areas in each group: " + totalShapesAreaByGroup);
        List<List<Shape>> listOfFilteredShapes = List.of(
        filterShapesByShapeGroup(ShapeFactory.provideShapes(), CIRCLE),
        filterShapesByShapeGroup(ShapeFactory.provideShapes(), TRIANGLE),
        filterShapesByShapeGroup(ShapeFactory.provideShapes(), RECTANGLE),
        filterShapesByShapeGroup(ShapeFactory.provideShapes(), REGULAR_POLYGON)
        );
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

    private static List<Shape> findFirstBigShape(List<Shape> listOfShapes) {
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

    private static Map<ShapeGroup, Double> sumAreasOfShapesInGroup(List<Shape> provideShapes) {
        Map<ShapeGroup, Double> totalAreaInGroup = new HashMap<>();
        double totalSum = 0.0;
        for (ShapeGroup shapeEnum : SHAPE_TYPE_LIST){
            for (Shape shape : provideShapes){
                totalSum = totalSum + shape.getShapeArea();
            }
            totalAreaInGroup.put(shapeEnum, totalSum);
        }
        return totalAreaInGroup;
    }

    private static List<Shape> showTheBiggestShapeOfEachArea (List<Shape> listOfShapes){
        for (ShapeGroup shapeGroup : ShapeGroup.values()){
            filterShapesByShapeGroup(ShapeFactory.provideShapes(), shapeGroup);
        }
        List<Shape> sortedShapesByArea;
        sortedShapesByArea = sortShapesByArea(listOfShapes);
        return findFirstBigShape(sortedShapesByArea);
    }

    private static List<Shape> filterShapesByShapeGroup(List<Shape> provideShapes, ShapeGroup shapeGroup) {
        List<Shape> listOfOneGroupShapes = new ArrayList<>();
        for (Shape shapeEnum : provideShapes){
            if (shapeEnum.getShapeGroup().equals(shapeGroup)){
                listOfOneGroupShapes.add(shapeEnum);
            }
        }
        return listOfOneGroupShapes;
    }
}