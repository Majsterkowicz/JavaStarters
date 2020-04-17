package collections;

import java.util.Map;

public class Circle extends Shape {

    public Circle(ShapeType shapeType, Map<String, Double> shapeParameters) {
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
        double radiusValue = shapeParameters.get("radius");
        return Math.PI * radiusValue * radiusValue;
    }
}