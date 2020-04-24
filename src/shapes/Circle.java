package shapes;

import java.util.Map;

public class Circle extends Shape {

    private final double radius;

    public Circle(double radius) {
        super(ShapeGroup.CIRCLE);
        this.radius = radius;
        setShapeType("circle");
        setShapeArea(calculateArea());
    }

    @Override
    public ShapeGroup getShapeGroup() {
        return super.getShapeGroup();
    }

    @Override
    public Map<String, Double> getShapeParameters() {
        return Map.of("radius", radius);
    }

    @Override
    public Double getShapeArea() {
        return super.getShapeArea();
    }

    @Override
    public String getShapeType() {
        return super.getShapeType();
    }

    /*@Override
    public void setShapeType(String shapeType){
        this.shapeType = shapeType;
    }*/

    @Override
    public double calculateArea() {
        if (radius <= 0) {
            return 0.0;
        }
        return Math.PI * radius * radius;
    }

    @Override
    public String printShapeData() {
        return String.format("This %s is in %s group. Has %s parameters and %s area", getShapeType(), getShapeGroup(), getShapeParameters(), getShapeArea());
    }
}