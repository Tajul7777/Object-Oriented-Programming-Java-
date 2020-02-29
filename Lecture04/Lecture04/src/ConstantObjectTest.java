/**
 * Created by swakkhar on 6/1/16.
 */
public class ConstantObjectTest {
    public static void main(String args[])
    {
        final Date constDate=new Date(2016,6,1);
        constDate.setYear(2017);
        // constDate = new Date();  this is not allowed
    }
}

