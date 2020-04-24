package shapes;

import java.util.Comparator;

public class CustomShapeComparator implements Comparator<Shape> {


    @Override
    public int compare(Shape shape1, Shape shape2) {
        return Double.compare(shape1.getShapeArea(), shape2.getShapeArea());
//
//        double differential = shape1.getShapeArea() - (shape2.getShapeArea());
//        if (differential > 0) {
//            return 1;
//        } else if (differential == 0) {
//            return 0;
//        }
//        return -1;
    }
}

