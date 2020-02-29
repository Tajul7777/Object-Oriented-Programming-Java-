/**
 * Created by swakkhar on 6/16/16.
 */
class Sqaure{
    private double armLength;

    public Sqaure(double armLength) {
        this.armLength = armLength;
    }
    public double getArea() {
        return armLength*armLength;
    }
}
interface Drawable{
    public void draw();
}
class ColoredDrawableSqaure extends Sqaure implements Drawable{
    public void draw(){
        System.out.println("In the draw method!");
    }
    public ColoredDrawableSqaure(double armLength) {
        super(armLength);
    }
}

public class InterfaceInheritence {
    public static void main(String []args) {
        Drawable d;
        Sqaure s;
        ColoredDrawableSqaure cds = new ColoredDrawableSqaure(5);
        d=cds;
        d.draw();
        s=cds;
        System.out.println("Area is:"+s.getArea());
    }
}
