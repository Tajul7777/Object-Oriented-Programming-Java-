package packone;

/**
 * Created by swakkhar on 5/24/16.
 */

class Small{

    public String name;

    public Small(String name) {
        this.name = name;
    }
}

public class ReferenceTest {
    public static void main(String args[])
    {
        String temp=new String("Dhaka");
        Small m=new Small(temp);

        temp.toLowerCase();

        System.out.println(temp);
        System.out.println(m.name);


    }
}
