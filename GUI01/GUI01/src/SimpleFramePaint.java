import javax.swing.*;
import java.awt.*;
/**
 * Created by swakkhar on 6/25/16.
 */
public class SimpleFramePaint extends JFrame {
    public void paint(Graphics g)
    {
        g.drawRect(100,100,50,50);
        g.drawString("This is a rectangle",100,90);
    }
    public SimpleFramePaint()
    {
        super("My Frame Drawings!");
        setSize(400,400);
        setLocation(100,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String ... args)
    {
        new SimpleFramePaint();
    }
}


