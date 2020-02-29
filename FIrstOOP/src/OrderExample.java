/**
 * Created by swakkhar on 6/1/16.
 */
public class OrderExample
{
    int aField = 1;
    {
        System.out.println( "First block: " + aField );
        aField++;
    }
    public OrderExample()
    {
        System.out.println( "Start Constructor: " + aField );
        aField++;
        System.out.println( "End Constructor: " + aField );
    }
    {
        System.out.println( "Second block: " + aField );
        aField++;
    }
    public static void main( String args[] )
    {
        OrderExample test = new OrderExample();
    }
}

