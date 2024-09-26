package font_and_color;

/*One way to create a Color  object is to call the Color  constructor, 
passing it the red, green, and blue values you want to use, as in this example: 
Color c= new Color(255, 255, 0) */

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.*;

public class createColor {
    public static void main(String[] args) {
        new color();
    }
}

class color extends JFrame{
    public color(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(333,222);
        setTitle("Fun with colors");
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Hello");
        /*Every Swing component has two methods that let you set the colors used to draw the component: setForeground  and setBackground */
        label.setForeground(Color.RED);
        panel.add(label);
        add(panel);
        setVisible(true);
    }
}