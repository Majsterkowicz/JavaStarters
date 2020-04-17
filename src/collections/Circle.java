package collections;

import java.util.Map;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        super(ShapeType.CIRCLE);
        this.radius = radius;
        setShapeArea(calculateArea());
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
    public Double getShapeArea() {
        return super.getShapeArea();
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}