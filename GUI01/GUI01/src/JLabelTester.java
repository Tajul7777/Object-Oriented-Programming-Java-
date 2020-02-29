import javax.swing.*;
import java.awt.*;

/**
 * Created by swakkhar on 6/25/16.
 */
public class JLabelTester extends JFrame
{
    public JLabelTester()
    {
        super("Simple Frame");
        ImageIcon ic=new ImageIcon("src/java.png");
        System.out.println(ic.getIconHeight());
        JLabel label1=new JLabel();
        label1.setText("My Label");
        JLabel label2=new JLabel("Label with Image",ic,JLabel.CENTER);
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        c.add(label1);
        c.add(label2);
        label2.setVisible(true);
        setSize(450,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(400,300);
        setVisible(true);

    }

    public static void main(String args[])
    {
        new JLabelTester();
    }
}
