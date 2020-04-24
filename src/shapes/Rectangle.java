package shapes;

import java.util.Map;

public class Rectangle extends Shape {

    private final double side1;
    private final double side2;

    public Rectangle(double side1, double side2) {
        super(ShapeGroup.RECTANGLE);
        this.side1 = side1;
        this.side2 = side2;
        setShapeArea(calculateArea());
        setShapeType(setShapeType());
    }

    @Override
    public ShapeGroup getShapeGroup() {
        return super.getShapeGroup();
    }

    @Override
    public Map<String, Double> getShapeParameters() {
        if (side1 == side2) {
            return Map.of("side1", side1);
        }
        return Map.of("side1", side1, "side2", side2);
    }

    @Override
    public Double getShapeArea() {
        return super.getShapeArea();
    }

    @Override
    public double calculateArea() {
        if (side2 <= 0 || side1 <= 0){
            return 0.0;
        }
        return side1 * side2;
    }

    @Override
    public String printShapeData() {
        return String.format("This %s is in %s group. Has %s parameters and %s area", getShapeType(), getShapeGroup(), getShapeParameters(), getShapeArea());
    }

    public String setShapeType() {
        if (side1 == side2) {
            return "square";
        }
        return "rectangle";
    }
}