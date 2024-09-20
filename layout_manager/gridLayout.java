package layout_manager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;

// in java, grid layout is rarely used
public class gridLayout extends JFrame{
    public static void main(String[] args) {
        new gridLayout();
    }
    public gridLayout(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(333,222);
        this.setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 3, 0, 0));
        
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("*"));
        panel.add(new JButton("0"));
        panel.add(new JButton("#"));

        this.add(panel);
        this.setVisible(true);
    }
}
