package collections;

import java.util.Map;

public class Rectangle extends Shape {

    public Rectangle(ShapeType shapeType, Map<String, Double> shapeParameters){
        super(shapeType, shapeParameters);
    }

    @Override
    public ShapeType getShapeType() {
        return super.getShapeType();
    }

    @Override
    public Map<String, Double> getShapeParameters() {
        return super.getShapeParameters();
    }

    @Override
    public double getShapeArea() {
        return super.getShapeArea();
    }

    @Override
    public double calculateArea(Map<String, Double> shapeParameters) {
        double firstSideValue = shapeParameters.get("side1");
        double secondSideValue = shapeParameters.get("side2");
        return firstSideValue * secondSideValue;
    }
}