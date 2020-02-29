/**
 * Created by swakkhar on 6/16/16.
 */
interface InterfaceShape {
    double getArea();
    void draw();
}
class CRectangle implements InterfaceShape{
    private double width;
    private double height;
    public double getArea() {
        return width*height;
    }
    public void draw() {
        System.out.println("In Draw: " +
                "I am a rectangle");
    }
    public CRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
}

class CTriangle implements InterfaceShape{
    private double base;
    private double height;
    public double getArea()
    {
        return 0.5*base*height;
    }
    public void draw()
    {
        System.out.println("In Draw: " +
                "I am a triangle");
    }
    public CTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
}

public class InterfaceTester {
    public static void main(String []args)
    {
        InterfaceShape in; // only a reference
        CRectangle mRec=new CRectangle(4,5);
        CTriangle mTri=new CTriangle(4,5);
        in = mRec;
        in.draw();
        System.out.println("Area of the shape:"
                +in.getArea());
        in = mTri;
        in.draw();
        System.out.println("Area of the shape:"
                +in.getArea());
    }
}



