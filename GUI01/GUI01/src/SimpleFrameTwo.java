import javax.swing.*;

/**
 * Created by swakkhar on 6/25/16.
 */
public class SimpleFrameTwo extends JFrame{

    public SimpleFrameTwo()
    {
        super("My Application");
        setSize(400,400);
        setLocation(100,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String ... args)
    {
        new SimpleFrameTwo();
    }
}

