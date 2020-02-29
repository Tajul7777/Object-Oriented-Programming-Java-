/**
 * Created by swakkhar on 6/8/16.
 */

class Shape {
    double dim1;
    double dim2;

    Shape(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double getArea() {
        // this function is not defined
        System.out.println("No valid value for " +
                "the getArea of a Shape.");
        return -1;
    }
}

class Rectangle extends Shape {
    Rectangle(double a, double b) {
        super(a, b);
    }

    // override getArea for rectangle
    double getArea() {
        System.out.println("Inside Area " +
                "for Rectangle.");
        return dim1 * dim2;
    }
}

class Triangle extends Shape {
    Triangle(double a, double b) {
        super(a, b);
    }

    // override getArea for right triangle
    double getArea() {
        System.out.println("Inside Area " +
                "for Triangle.");
        return dim1 * dim2 / 2;
    }
}

public class GetAreaTester {
    public static void main(String args[]) {
        Shape f = new Shape(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Shape shapeRef;
        shapeRef = r;
        System.out.println("Area is "
                + shapeRef.getArea());
        shapeRef = t;
        System.out.println("Area is "
                + shapeRef.getArea());
        shapeRef = f;
        System.out.println("Area is "
                + shapeRef.getArea());
    }
}

