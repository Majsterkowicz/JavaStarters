package collections;

import java.util.*;

public abstract class Shape {

    private final ShapeType shapeType;
    private Map<String, Double> shapeParameters;
    private Double shapeArea;

    public Shape(ShapeType shapeType) {
        this.shapeType = shapeType;
    }

    public ShapeType getShapeType() {
        return shapeType;
    }

    public Map<String, Double> getShapeParameters() {
        return shapeParameters;
    }

    public Double getShapeArea() {
        return shapeArea;
    }

    public void setShapeArea(double shapeArea) {
        this.shapeArea = shapeArea;
    }

    public abstract double calculateArea();

    public String toString() {
        return String.format("%s has parameters: %s. Shape area is: %s", getShapeType(), getShapeParameters(), getShapeArea());
    }

    //public String printData();
}