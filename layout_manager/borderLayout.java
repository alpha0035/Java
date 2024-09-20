package layout_manager;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

public class borderLayout extends JFrame{
    public static void main(String[] args) {
        new borderLayout();
    }
    public borderLayout(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(333,222);
        this.setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        
        panel.setLayout(new BorderLayout());
        panel2.setLayout(new BorderLayout());
        panel2.add(new JLabel("Hello boss!"), BorderLayout.EAST);
        panel.add(panel2, BorderLayout.SOUTH);
        this.add(panel);
        this.setVisible(true);
    }
}
