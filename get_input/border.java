package get_input;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

public class border extends JFrame{
    public static void main(String[] args) {
        new border();
    }
    public border(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(333,222);
        this.setLocationRelativeTo(null);
        this.setTitle("Hello boss!");
        JPanel panel= new JPanel();
        panel.add(new JLabel("Hi border!"));
        Border border= BorderFactory.createBevelBorder(BevelBorder.LOWERED);
        border= BorderFactory.createTitledBorder("Size.");
        panel.add(new JButton("Ok"));
        panel.setBorder(border);
        Border border2= BorderFactory.createBevelBorder(BevelBorder.LOWERED);
        border2= BorderFactory.createTitledBorder("Radious");
        JPanel panel2 = new JPanel();
        panel2.setBorder(border2);
        this.add(panel);
        this.add(panel2);
        this.setVisible(true);
    }
}
