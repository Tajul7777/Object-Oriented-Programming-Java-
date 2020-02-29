import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by swakkhar on 6/25/16.
 */
public class SimpleEventHandler extends JFrame implements ActionListener{

    JButton btnOne;
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnOne)
            JOptionPane.showMessageDialog(null,"You clicked the button!");
    }
    public SimpleEventHandler()
    {
        super("My Application");
        setSize(400,400);
        setLocation(100,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnOne = new JButton("Click");
        btnOne.addActionListener(this);
        setLayout(new FlowLayout());
        add(btnOne);


        setVisible(true);
    }
    public static void main(String ... args)
    {
        new SimpleEventHandler();
    }
}