package collections;

import java.util.*;

public class Shape {

    private final ShapeType shapeType;
    private Map<String, Double> shapeParameters;
    private double shapeArea;

    public Shape(ShapeType shapeType, Map<String, Double> shapeParameters/*, double shapeArea*/) {
        this.shapeType = shapeType;
        this.shapeParameters = shapeParameters;
        /*this.shapeArea = shapeArea;*/
        shapeArea = calculateArea(shapeParameters);
    }

    public ShapeType getShapeType() {
        return shapeType;
    }

    public Map<String, Double> getShapeParameters() {
        return shapeParameters;
    }

    public double getShapeArea() {
        return shapeArea;
    }

    public double calculateArea(Map<String, Double> shapeParameters){
        return 0;
    }
}