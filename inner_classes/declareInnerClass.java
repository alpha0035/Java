package inner_classes;

import javax.swing.Action;
import javax.swing.*;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// An inner class is the class that is declared inside another class
public class declareInnerClass {
    static String tick= "Tick...";
    static String tock= "Tock...";
    public static void main(String[] args) {
        declareInnerClass obj= new declareInnerClass();
        obj.go();
    }
    private void go(){
        // create t that calls the Ticker class
        // at 1 second intervals
        Timer t= new Timer(1000, new Ticker());
        t.start();

        //display a message box
        JOptionPane.showMessageDialog(null,  "Click the button to end");
        System.exit(0);
    }
    class Ticker implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            if(status) System.out.println(tick);
            else System.out.println(tock);
            status= !status;
            
        }
        private boolean status= true;
        
    }
}
