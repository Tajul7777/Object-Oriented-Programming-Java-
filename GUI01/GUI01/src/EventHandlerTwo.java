import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ButtonOneListener implements ActionListener
{
    JLabel lblAction;
    public ButtonOneListener(JLabel lblAction) {
        this.lblAction = lblAction;
    }
    public void actionPerformed(ActionEvent e) {
        lblAction.setText("You Pressed Button One");
    }
}

class ButtonTwoListener implements ActionListener
{
    JLabel lblAction;
    public ButtonTwoListener(JLabel lblAction) {
        this.lblAction = lblAction;
    }
    public void actionPerformed(ActionEvent e) {
        lblAction.setText("You Pressed Button Two");
    }
}

public class EventHandlerTwo extends JFrame{
    JButton btnOne;
    JButton btnTwo;
    JLabel lblOne;
    public EventHandlerTwo()
    {
        super("Event Handling Demo");
        setSize(400,200);
        setLocation(100,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        btnOne=new JButton("One");
        btnTwo=new JButton("Two");
        lblOne = new JLabel("This is a label");

        btnOne.addActionListener(new ButtonOneListener(lblOne));
        btnTwo.addActionListener(new ButtonTwoListener(lblOne));

        add(lblOne);
        add(btnOne);
        add(btnTwo);

        setVisible(true);
    }
    public static void main(String ... args)
    {
        new EventHandlerTwo();
    }
}




