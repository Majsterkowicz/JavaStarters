package shapes;

import java.util.Map;

public class Triangle extends Shape {

    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        super(ShapeGroup.TRIANGLE);
        this.base = base;
        this.height = height;
        setShapeType("triangle");
        setShapeArea(calculateArea());
    }

    @Override
    public ShapeGroup getShapeGroup() {
        return super.getShapeGroup();
    }

    @Override
    public Map<String, Double> getShapeParameters() {
        return Map.of("base", base, "height", height);
    }

    @Override
    public Double getShapeArea() {
        return super.getShapeArea();
    }

    @Override
    public double calculateArea() {
        if (base <= 0 || height <= 0) {
            return 0.0;
        }
        return base * height * 0.5;
    }

    @Override
    public String printShapeData() {
        return String.format("This %s is in %s group. Has %s parameters and %s area", getShapeType(), getShapeGroup(), getShapeParameters(), getShapeArea());
    }
}