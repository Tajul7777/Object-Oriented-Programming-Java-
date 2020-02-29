/**
 * Created by swakkhar on 6/19/16.
 */
public class HandleDivisionZeroExp {
    public static void main(String args[])
    {
        try {
            int a=9;
            int b=0;
            int c=a/b;
        } catch (Exception e) {
            System.out.println("Error Caught< "+e.getMessage());
            e.printStackTrace();

        }
    }
}


