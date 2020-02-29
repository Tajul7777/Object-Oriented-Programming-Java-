/**
 * Created by swakkhar on 5/23/16.
 */
public class LocationTestOne {
    public static void main(String args[])
    {
        Location dhaka = new Location(23.8,90.4);
        Location unKnown = dhaka;
        unKnown.setLongitude(90.5);
        System.out.println(dhaka);

    }
}

