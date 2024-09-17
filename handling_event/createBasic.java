package handling_event;
/*Flow of handling event in Java:
 * Create a component that can generate events
 * Create a class that implements listener interface for the event you want handle
 * Write a code for any method defined by interface
 * Register the listener with the source
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class createBasic {
    public static void main(String[] args) {
        new clickMe();
        new innerClick();
        new lambdaClick();
    }
}
class clickMe extends JFrame
implements ActionListener
{
    private JButton button1;
    public clickMe(){
        this.setTitle("Hello Frame");
        this.setSize(399, 299);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel1= new JPanel();
        button1= new JButton("Click here!");

        button1.addActionListener(this);
        panel1.add(button1);
        this.add(panel1);
    }
    private int count=0;
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()== button1){
            count++;
            if(count==1) button1.setText("You've click this");
            else button1.setText("You click "+count+" times");
        }
    }
}

// you can also use an inner class that implements listener interface
class innerClick extends JFrame{
    private JButton button1= new JButton("Click here!");
    private int cnt=0;
    public innerClick(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Click event");
        this.setSize(399, 299);
        this.setLocation(500, 500);
        this.setVisible(true);
        JPanel panel1 = new JPanel();        
        button1.addActionListener(new click());
        panel1.add(button1);
        this.add(panel1);

    }
    // inner class
    private class click implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            if(e.getSource()==button1){
                cnt++;
                if(cnt==1) button1.setText("you click 1 time!");
                else button1.setText("You click "+cnt+" times!");
            }
        }
        
    }
}

// or using anoymous class
class lambdaClick extends JFrame{
    private JButton button1;
    private int cnt=0;
    public lambdaClick(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Hello");
        this.setSize(399, 299);
        this.setVisible(true);
        this.setLocation(800, 200);
        JPanel panel= new JPanel();
        button1= new JButton("Click here!");
        button1.addActionListener(e->{
            if(e.getSource()==button1){
                cnt++;
                if(cnt==1) button1.setText("You click 1 time.");
                else button1.setText("You click "+ cnt+" times.");
            }
        });
        panel.add(button1);
        this.add(panel);
    }
}