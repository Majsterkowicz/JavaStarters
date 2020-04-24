package shapes;

import java.util.Map;

public class RegularPolygon extends Shape {

    private final double side;
    private final double numberOfSides;

    public RegularPolygon(double side, int numberOfSides) {
        super(ShapeGroup.REGULAR_POLYGON);
        this.side = side;
        this.numberOfSides = numberOfSides;
        setShapeType(setShapeType());
        setShapeArea(calculateArea());
    }

    @Override
    public ShapeGroup getShapeGroup() {
        return super.getShapeGroup();
    }

    @Override
    public Map<String, Double> getShapeParameters() {
        return Map.of("side length", side, "number of sides", numberOfSides);
    }

    @Override
    public double calculateArea() {
        if (numberOfSides <= 2 || side <= 0) {
            return 0;
        }
        double excircle = side / (2.0 * Math.sin(Math.PI / numberOfSides));
        return 0.5 * numberOfSides * Math.pow(excircle, 2) * Math.sin(2 * Math.PI / numberOfSides);
    }

    public String setShapeType() {
        if (numberOfSides <= 2) {
            return "none-shape";
        } else if (numberOfSides == 3) {
            return "triangle";
        } else if (numberOfSides == 4) {
            return "square";
        } else if (numberOfSides == 5) {
            return "pentagon";
        } else if (numberOfSides == 6) {
            return "hexagon";
        }
        return "multipolygon";
    }

    @Override
    public String printShapeData() {
        return String.format("This %s is in %s group. Has %s parameters and %s area", getShapeType(), getShapeGroup(), getShapeParameters(), getShapeArea());
    }
}