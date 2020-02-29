/**
 * Created by swakkhar on 6/16/16.
 */
interface InterfaceTwo{
    int YES=0;
    int NO=1;
    Triangle2D triangle = new Triangle2D(5,6);
    // int NO_VALUE; - this is not allowed
}
class ImplementerTwo implements InterfaceTwo{
}
public class InterfaceFieldTest {
    public static void main(String []args){
        ImplementerTwo imp1= new ImplementerTwo();
        ImplementerTwo imp2 = new ImplementerTwo();
        imp1.triangle.dim1 = 7;
        System.out.println(imp2.triangle.dim1);
        // imp1.triangle = new Triangle2D(7,8); - not allowed
    }
}

