import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class EventHandlerOne extends JFrame implements ActionListener{
    JButton btnOne;
    JButton btnTwo;
    JLabel lblOne;
    public EventHandlerOne()
    {
        super("Event Handling Demo");
        setSize(400,200);
        setLocation(100,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        btnOne=new JButton("One");
        btnTwo=new JButton("Two");
        lblOne = new JLabel("This is a label");

        btnOne.addActionListener(this);
        btnTwo.addActionListener(this);

        add(lblOne);
        add(btnOne);
        add(btnTwo);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnOne)
            lblOne.setText("You pressed Button One");
        else if(e.getSource()==btnTwo)
            lblOne.setText("You pressed Button Two");
    }
    public static void main(String ... args)
    {
        new EventHandlerOne();
    }


}

