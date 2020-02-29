import javax.swing.*;
/**
 * Created by swakkhar on 6/25/16.
 */
public class DefaultLayout extends JFrame{
    public DefaultLayout()
    {
        super("My Application");
        setSize(400,400);
        setLocation(100,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblOne=new JLabel("This is a label!");
        add(lblOne);

        JButton btnOne=new JButton("Click");
        add(btnOne);

        setVisible(true);
    }
    public static void main(String ... args)
    {
        new DefaultLayout();
    }
}


