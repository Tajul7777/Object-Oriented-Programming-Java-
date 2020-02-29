/**
 * Created by swakkhar on 5/23/16.
 */
public class CastingTest {

    public static void main(String [] args)
    {
        ColoredRectangle cRect=new ColoredRectangle();

        Rectangle sRect = cRect;

        // this is not possible directly
        //cRect = sRect;  // gives a compilation error Incompatible Type
        // however it is possible to cast
        cRect = (ColoredRectangle) sRect;
        System.out.println("Call child method after casting:"+cRect.getPeriphery());

        // can not do the following
        // ParentOne pOne = cRect;
    }
}

