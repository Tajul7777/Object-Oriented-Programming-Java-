/**
 * Created by swakkhar on 5/11/16.
 */
public class Rectangle {

    private int height;     // height of the rectangle
    private int width;      // width of the rectangle

    public Rectangle(int height,int width)
    {
        this.height=height;
        this.width=width;
    }

    public Rectangle()
    {
        height=0;
        width=0;
    }

    public String toString() {
        return "Rectangle( height-"+height+",width-"+width+")";
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getArea() {
        return height * width;
    }
    public int getArea(int w,int h)
    {
        return w*h;
    }
    public void increaseWidth(int w) {
        width += w;
    }
}

