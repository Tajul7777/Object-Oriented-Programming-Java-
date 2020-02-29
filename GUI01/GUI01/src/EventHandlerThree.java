import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class EventHandlerThree extends JFrame{
    JButton btnOne;
    JButton btnTwo;
    JLabel lblOne;
    public EventHandlerThree()
    {
        super("Event Handling Demo");
        setSize(400,200);
        setLocation(100,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        btnOne=new JButton("One");
        btnTwo=new JButton("Two");
        lblOne = new JLabel("This is a label");
        btnOne.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lblOne.setText("You pressed Button One");
            }
        });
        btnTwo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lblOne.setText("You pressed Button Two");
            }
        });
        add(lblOne);
        add(btnOne);
        add(btnTwo);
        setVisible(true);
    }
    public static void main(String ... args)
    {
        new EventHandlerThree();
    }
}





