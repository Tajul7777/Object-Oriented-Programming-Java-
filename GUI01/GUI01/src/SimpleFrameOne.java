import javax.swing.*;

/**
 * Created by swakkhar on 6/25/16.
 */
public class SimpleFrameOne {
    public SimpleFrameOne()
    {
        JFrame frameObject=new JFrame();
        frameObject.setTitle("My Application");
        frameObject.setSize(400,400);
        frameObject.setLocation(100,100);
        frameObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameObject.setVisible(true);
    }
    public static void main(String... args)
    {
        new SimpleFrameOne();
    }
}


