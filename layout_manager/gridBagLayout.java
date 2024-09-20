package layout_manager;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

import get_input.sliders;

import java.awt.*;

/* When a panel uses the GridBag layout, the add  method accepts two parameters: 
the component to add and a GridBagConstraints  object that specifies where to place the component in the grid. 
The trick of using GridBag layout is figuring out how to set the GridBagConstraints  values to get each component to go where you want it to go. */
public class gridBagLayout extends JFrame{
    public static void main(String[] args) {
        new gridBagLayout();
    }
    public gridBagLayout(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(333,222);
        this.setLocationRelativeTo(null);
        
        /*create JPanel obj use GridBag layout */
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());

        // working with GridBagConstraints 
        GridBagConstraints bagConstraints = new GridBagConstraints();
        bagConstraints.gridx=0;
        bagConstraints.gridy=0;
        bagConstraints.gridwidth=2;
        bagConstraints.gridheight=1;
        bagConstraints.weightx=100;
        bagConstraints.weighty=100;
        bagConstraints.insets= new Insets(5, 5, 5, 5);
        panel.add(new JLabel("Hello"), bagConstraints);

        bagConstraints.gridx=2;
        bagConstraints.gridy=3;
        panel.add(new JButton("OK"), bagConstraints);

        JSlider sliders = new JSlider(0, 10, 5);
        sliders.setMajorTickSpacing(2);
        sliders.setMinorTickSpacing(1);
        sliders.setPaintTicks(true);
        sliders.setPaintLabels(true);
        addItem(panel, sliders, 3, 4, 1, 1, 100, 100);

        this.add(panel);
        this.setVisible(true);
    }

    // above apllication seem very long and complex, here you can use one method name addItem to reduce code
    private static void addItem(JPanel p, JComponent c, int x, int y, int width, int height, int wx, int wy){
        GridBagConstraints bagConstraints = new GridBagConstraints();
        bagConstraints.gridx= x;
        bagConstraints.gridy= y;
        bagConstraints.gridwidth= width;
        bagConstraints.gridheight= height;
        bagConstraints.weightx= wx;
        bagConstraints.weighty= wy;
        p.add(c, bagConstraints);
    }
}
