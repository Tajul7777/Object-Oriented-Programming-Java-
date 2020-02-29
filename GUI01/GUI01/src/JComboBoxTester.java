import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by swakkhar on 6/25/16.
 */
public class JComboBoxTester extends JFrame implements ActionListener
{
    JComboBox comboBox;

    public JComboBoxTester()
    {
        super("Simple Frame");
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        comboBox=new JComboBox();
        comboBox.addItem("A");
        comboBox.addItem("B");
        comboBox.addItem("C");
        comboBox.addItem("D");
        comboBox.addItem("E");
        c.add(comboBox);
        comboBox.addActionListener(this);
        setSize(250,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(300,300);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae)
    {
        JOptionPane.showMessageDialog(null,"You Selected : (" + comboBox.getSelectedIndex() + ", " + comboBox.getSelectedItem().toString() + ")");
    }

    public static void main(String args[])
    {
        new JComboBoxTester();
    }
}