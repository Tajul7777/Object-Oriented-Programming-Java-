/**
 * Created by swakkhar on 6/1/16.
 */

public class OrderExampleTwo
{
    public OrderExampleTwo()
    {
        a = 8;
        // OK
    }
    {
        a = 4;
        // Compile Error
    }
    int a = 1;
    public int getC()
    {
        return c;
    }
    int c = 3;
    {
        a = 4;
    }
    public static void main(String []args)
    {
        OrderExampleTwo two=new OrderExampleTwo();
        System.out.println(two.a);
    }
}