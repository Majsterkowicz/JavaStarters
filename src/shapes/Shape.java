package shapes;

import java.util.Map;

public abstract class Shape {

    private final ShapeGroup shapeGroup;
    private String shapeType;
    private Double shapeArea;

    public Shape(ShapeGroup shapeGroup) {
        this.shapeGroup = shapeGroup;
    }

    public ShapeGroup getShapeGroup() {
        return shapeGroup;
    }

    public Double getShapeArea() {
        return shapeArea;
    }

    public void setShapeArea(double shapeArea) {
        this.shapeArea = shapeArea;
    }

    public abstract Map<String, Double> getShapeParameters();

    public String getShapeType(){
        return shapeType;
    }

    public void setShapeType(String shapeType){
        this.shapeType = shapeType;
    }

    public abstract double calculateArea();

    public abstract String printShapeData();
}