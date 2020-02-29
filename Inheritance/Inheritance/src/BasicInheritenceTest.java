/**
 * Created by swakkhar on 5/14/16.
 */
public class BasicInheritenceTest {

    public static void main(String args[])
    {
        ColoredRectangle cRec=new ColoredRectangle();
        System.out.println(cRec.getArea()); // calling parent function
        System.out.println(cRec.getPeriphery()); // calling child function
        System.out.println(cRec.getColor()); // calling child function
        System.out.println("Height of the rectangle:"+cRec.height);
    }
}


