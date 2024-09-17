package handling_event;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.nio.file.WatchEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class windowClosingEvent extends JFrame{
    public static void main(String[] args) {
        new windowClosingEvent();
    }
    private JButton but, exitBut;
    private int cnt=0;
    public windowClosingEvent(){
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setTitle("Hello");
        this.setSize(399, 299);
        this.setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                exitBut.doClick();
            }
        });
        but= new JButton("Click!");
        exitBut= new JButton("Exit.");
        but.addActionListener(e->{
            cnt++;
            but.setText("You click "+cnt);
        });
        exitBut.addActionListener(e->{
            System.exit(0);
        });
        JPanel panel = new JPanel();
        panel.add(but);
        panel.add(exitBut);
        this.add(panel);
    }
}
