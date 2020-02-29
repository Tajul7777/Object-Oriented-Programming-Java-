/**
 * Created by swakkhar on 5/14/16.
 */
public class ColoredRectangle extends Rectangle {

    private String color ="Blue";
    public int getPeriphery()
    {
        return 2*width*height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}


