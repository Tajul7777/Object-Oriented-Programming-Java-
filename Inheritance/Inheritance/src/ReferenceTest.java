/**
 * Created by swakkhar on 5/23/16.
 */
public class ReferenceTest {
    public static void main(String args[])
    {
        Rectangle sRect = new Rectangle();
        sRect.height=12;
        sRect.width=13;
        System.out.println("Area of the parent Variable:"+sRect.getArea());

        ColoredRectangle cRect=new ColoredRectangle();
        cRect.height=10;
        cRect.width=15;
        cRect.setColor("Yellow");
        System.out.println("Area of the child Variable:"+cRect.getArea());
        System.out.println("Periphery of the child Variable:"+cRect.getPeriphery());

        // assign child reference to parent
        sRect=cRect;
        System.out.println("Area of parent reference after assignment:"+sRect.getArea());
        // can not do the following
        //System.out.println("Periphery of parent reference after assignment:"+sRect.getPeriphery());
    }
}




