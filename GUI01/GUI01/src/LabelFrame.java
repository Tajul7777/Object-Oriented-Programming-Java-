import javax.swing.*;

/**
 * Created by swakkhar on 6/25/16.
 */
public class LabelFrame extends JFrame {
    public LabelFrame()
    {
        super("My Application");
        setSize(400,400);
        setLocation(100,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblOne=new JLabel("This is a label!");
        add(lblOne);

        setVisible(true);
    }
    public static void main(String ... args)
    {
        new LabelFrame();
    }
}
