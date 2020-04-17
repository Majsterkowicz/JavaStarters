package collections;

import java.util.Map;

public class Triangle extends Shape {

    public Triangle(ShapeType shapeType, Map<String, Double> shapeParameters){
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
        double baseValue = shapeParameters.get("base");
        double heightValue = shapeParameters.get("height");
        return baseValue * heightValue * 0.5;
    }
}