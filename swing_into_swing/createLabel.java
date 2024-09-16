package swing_into_swing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// a label is useful component to add to panel, this use to display text or image
public class createLabel extends JFrame{
    public static void main(String[] args) {
        new HelloFrame();
    }
}
class HelloFrame extends JFrame{
    public HelloFrame(){
        this.setTitle("Hi you");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(299,399);
        JPanel panel= new JPanel();
        JLabel label= new JLabel("This is you");
        panel.add(label);
        this.add(panel);
        // this.add(new HelloPanel());
        this.setVisible(true);
        this.setResizable(false);
    }
}
// class HelloPanel extends JPanel{
//     public HelloPanel(){
//         JLabel label= new JLabel("This is Alpha Seven!");
//         this.add(label);
//     }
// }