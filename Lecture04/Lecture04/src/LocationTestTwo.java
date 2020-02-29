/**
 * Created by swakkhar on 5/23/16.
 */
public class LocationTestTwo {
    public static void shallowSwap(Location a, Location b)
    {
        System.out.println("In Shallow Swap (Before)");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        Location temp=a;
        a=b;
        b=temp;
        System.out.println("In Shallow Swap (After)");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }

    public static void deepSwap(Location a, Location b)
    {
        double tempLat=a.getLatitude();
        double tempLong=a.getLongitude();
        a.setLatitude(b.getLatitude());
        a.setLongitude(b.getLongitude());
        b.setLatitude(tempLat);
        b.setLongitude(tempLong);
    }

    public static void main(String args[])
    {
        Location dhaka=new Location(23.8,90.4);
        Location sanDiago = new Location(32.9, -117.2);
        shallowSwap(dhaka,sanDiago);
        System.out.println("In Main After Shallow Swap");
        System.out.println("Dhaka:"+dhaka);
        System.out.println("San Diago:"+sanDiago);

        System.out.println();
        deepSwap(dhaka,sanDiago);
        System.out.println("In Main After Deep Swap");
        System.out.println("Dhaka:"+dhaka);
        System.out.println("San Diago:"+sanDiago);
    }
}
