package handling_event;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*Create exit button and add it to the frame
 * Create a method will be called when user click exit
 * Call above method in the action event listener
 */
public class addExit {
    public static void main(String[] args){
        new hiFrame();
    }
}

class hiFrame extends JFrame{
    private JButton but, butExit;
    private int cnt;
    public hiFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Hello");
        this.setVisible(true);
        this.setSize(399,299);
        JPanel panel= new JPanel();
        but= new JButton("Click!");
        butExit= new JButton("Exit!");
        but.addActionListener(e->clickBut());
        butExit.addActionListener(e->clickExit());
        panel.add(but);
        panel.add(butExit);
        this.add(panel);
    }
    public void clickBut(){
        cnt++;
        but.setText("You click "+cnt+"!");
    }
    public void clickExit(){
        System.exit(0);
    }
}