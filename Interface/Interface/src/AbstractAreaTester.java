/**
 * Created by swakkhar on 6/8/16.
 */
abstract class Shape2D {
    double dim1;
    double dim2;

    Shape2D(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    // getArea is now an an abstract method
    abstract double getArea();
}

class Rectangle2D extends Shape2D {
    Rectangle2D(double a, double b) {
        super(a, b);
    }

    // override getArea for rectangle
    double getArea() {
        System.out.println("Inside Area for " +
                "Rectangle2D.");
        return dim1 * dim2;
    }
}

class Triangle2D extends Shape2D {
    Triangle2D(double a, double b) {
        super(a, b);
    }

    // override getArea for right triangle
    double getArea() {
        System.out.println("Inside Area " +
                "for Triangle2D.");
        return dim1 * dim2 / 2;
    }
}


public class AbstractAreaTester {
    public static void main(String args[]) {
        // Shape2D f = new Shape2D(10, 10); // illegal now
        Rectangle2D r = new Rectangle2D(9, 5);
        Triangle2D t = new Triangle2D(10, 8);
        Shape2D shapeRef;
        // this is OK, no object is created
        shapeRef = r;
        System.out.println("Area is "
                + shapeRef.getArea());

        shapeRef = t;
        System.out.println("Area is "
                + shapeRef.getArea());
    }
}

