package collections;

import java.util.Map;

public class Hexagon extends Shape {

    public Hexagon(ShapeType shapeType, Map<String, Double> shapeParameters) {
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
        double sideValue = shapeParameters.get("side");
        return sideValue * sideValue * Math.sqrt(3) * 1.5;
    }
}