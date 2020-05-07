package shapes;

import java.util.*;

import static shapes.ShapeGroup.*;

public class ShapeStatistics {

    private static final List<ShapeGroup> shapeTypes = Arrays.asList
            (CIRCLE, TRIANGLE, RECTANGLE, REGULAR_POLYGON); //TODO przerobić na SET

    public static void main(String[] args) {

        System.out.println("PRZED SORTOWANIEM");
        List<Shape> listOfShapes = ShapeFactory.providedShapes();
        showShapesDetails(listOfShapes);
        System.out.println("POSORTOWANE");
        List<Shape> sortedByShapeArea = sortShapesByArea(listOfShapes);
        showShapesDetails(sortedByShapeArea);
        List<Shape> theBiggestShapes = findFirstBigShape(sortedByShapeArea);
        System.out.println("The biggest shape is:");
        showShapesDetails(theBiggestShapes);
        Map<ShapeGroup, List<Shape>> mappedShapes = mapShapesByGroup(listOfShapes);
        showNumberOfShapesInGroup(mappedShapes);
        Map<ShapeGroup, Double> totalShapesAreaByGroup = sumAreasOfShapesInGroup(mappedShapes);
        System.out.println("Total shapes areas in each group: " + totalShapesAreaByGroup);
        showTheBiggestShapeOfEachGroup(mappedShapes);
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

    private static List<Shape> findFirstBigShape(List<Shape> listOfSortedShapes) {
        Shape theBiggestShape = null;
        List<Shape> theBiggestShapes = new ArrayList<>();
        for (Shape shape : listOfSortedShapes) {
            if (theBiggestShape == null) {
                theBiggestShape = shape;
                theBiggestShapes.add(shape);
            } else if (shape.getShapeArea().equals(theBiggestShape.getShapeArea())) {
                theBiggestShapes.add(shape);
            } else /*if (shape.getShapeArea() < theBiggestShape.getShapeArea())*/ {
                break;
            }
        }
        return theBiggestShapes;
    }

    private static Map<ShapeGroup, List<Shape>> mapShapesByGroup(List<Shape> listOfShapes) {
        Map<ShapeGroup, List<Shape>> mappedShapesByGroup = new HashMap<>();
        List<Shape> oneGroupShapes = new ArrayList<>();
        for (ShapeGroup groupOfShape : shapeTypes) {
            oneGroupShapes.clear();
            for (Shape shape : listOfShapes) {
                if (shape.getShapeGroup().equals(groupOfShape)) {
                    oneGroupShapes.add(shape);
                }
            }
            mappedShapesByGroup.put(groupOfShape, oneGroupShapes);
            showShapesDetails(mappedShapesByGroup.get(groupOfShape));
        }
        return mappedShapesByGroup;
    }

    private static void showNumberOfShapesInGroup(Map<ShapeGroup, List<Shape>> mappedShapes) {
        for (Map.Entry<ShapeGroup, List<Shape>> mapEntry : mappedShapes.entrySet()) {
            System.out.println(String.format("%s group contains %s shapes", mapEntry.getKey(), mapEntry.getValue().size()));
        }
    }

    private static Map<ShapeGroup, Double> sumAreasOfShapesInGroup(Map<ShapeGroup, List<Shape>> mappedShapes) {
        Map<ShapeGroup, Double> totalAreaInGroup = new HashMap<>();
        double totalSum = 0.0;
        for (Map.Entry<ShapeGroup, List<Shape>> shapeEntry : mappedShapes.entrySet()) {
            for (Shape shape : shapeEntry.getValue()) {
                totalSum = totalSum + shape.getShapeArea();
            }
            totalAreaInGroup.put(shapeEntry.getKey(), totalSum);
        }
        return totalAreaInGroup;
    }

    private static void showTheBiggestShapeOfEachGroup(Map<ShapeGroup, List<Shape>> mappedShapes) {
        System.out.println("The biggest shapes of each group are:");
        List<Shape> bigShape = new ArrayList<>();
        for (Map.Entry<ShapeGroup, List<Shape>> shapeEntry : mappedShapes.entrySet()) {
           /* bigShape.clear();
            bigShape = findFirstBigShape(sortShapesByArea(shapeEntry.getValue()));*/
            showShapesDetails(shapeEntry.getValue());
        }
    }
}