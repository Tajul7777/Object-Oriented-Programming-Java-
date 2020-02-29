/**
 * Created by swakkhar on 6/1/16.
 */
public class StaticBlockTest {
    public static int myVar=0;

    static
    {
        setMyVar(10);
        System.out.println("In static block");
    }

    public static void setMyVar(int mv) {
        myVar=mv;
    }

    public static void main(String args[])
    {
        System.out.println("Hello World!");
    }
}

