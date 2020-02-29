/**
 * Created by swakkhar on 6/1/16.
 */
public class LocationTestThree
{
    public static void changeLattitude(Location a)
    {
        a.setLatitude(23.0);
    }
    public static void changeReference(Location a)
    {
        a=new Location();
        a.setLatitude(50.0);
        a.setLongitude(50.0);
    }
    public static void main(String [] args)
    {
        Location myLocation=new Location();
        System.out.println(myLocation);
        changeLattitude(myLocation);
        System.out.println(myLocation);
        changeReference(myLocation);
        System.out.println(myLocation);
    }
}

