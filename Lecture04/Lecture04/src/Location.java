/**
 * Created by swakkhar on 5/23/16.
 */
public class Location {
    private double latitude;
    private double longitude;

    public Location() {
        latitude=0.0;
        longitude=0.0;
    }

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
    public String toString()
    {
        return "LAT:"+latitude+" LONG:"+longitude;
    }
    public double getLatitude() {
        return latitude;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public double getLongitude() {
        return longitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}

