import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class FlowLayoutFrame extends JFrame
{
    private final JButton leftJButton; // button to set alignment left
    private final JButton centerJButton; // button to set alignment center
    private final JButton rightJButton; // button to set alignment right
    private final FlowLayout layout; // layout object
    private final Container container; // container to set layout

    // set up GUI and register button listeners
    public FlowLayoutFrame()
    {
        super("FlowLayout Demo");
        layout = new FlowLayout();
        container = getContentPane(); // get container to layout
        setLayout(layout);
        leftJButton = new JButton("Left");
        add(leftJButton);
        leftJButton.addActionListener(
                new ActionListener()
                {
                    public void actionPerformed(ActionEvent event)
                    {
                        layout.setAlignment(FlowLayout.LEFT);
                        layout.layoutContainer(container);
                    }
                }
        );
        centerJButton = new JButton("Center");
        add(centerJButton);
        centerJButton.addActionListener(
                new ActionListener()
                {
                    public void actionPerformed(ActionEvent event)
                    {
                        layout.setAlignment(FlowLayout.CENTER);
                        layout.layoutContainer(container);
                    }
                }
        );
        rightJButton = new JButton("Right");
        add(rightJButton);
        rightJButton.addActionListener(
                new ActionListener()
                {
                    // process rightJButton event
                    @Override
                    public void actionPerformed(ActionEvent event)
                    {
                        layout.setAlignment(FlowLayout.RIGHT);

                        // realign attached components
                        layout.layoutContainer(container);
                    }
                }
        );
    } // end FlowLayoutFrame constructor
} // end class FlowLayoutFrame
