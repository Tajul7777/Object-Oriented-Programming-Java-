import javax.swing.*;
import java.awt.*;
public class SimpleFlowLayout extends JFrame {
    public SimpleFlowLayout()
    {
        super("My Application");
        setSize(400,400);
        setLocation(100,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblOne=new JLabel("This is a label!");
        JButton btnOne=new JButton("Click");

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(lblOne);
        c.add(btnOne);

        /*setLayout(new FlowLayout());
        add(lblOne);
        add(btnOne);*/

        setVisible(true);
    }
    public static void main(String ... args)
    {
        new SimpleFlowLayout();
    }
}


