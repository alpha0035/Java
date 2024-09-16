package swing_into_swing;

import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// button is a type of components
public class createButton {
    public static void main(String[] args) {
        new HiFrame();
    }
}
class HiFrame extends JFrame{
    private static Scanner sc= new Scanner(System.in);
    public HiFrame(){
        this.setTitle("Hello");
        this.setSize(399, 299);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        JPanel panel1= new JPanel();
        JButton button1 = new JButton();
        button1.setText("Click here!");
        panel1.add(button1);
        this.add(panel1);
    }
}