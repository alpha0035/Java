package inner_classes;

import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.event.*;

// static inner class doesn't require an instance to excute
// similar to static method, static inner class can't access non-static field
public class staticInner {
    static String tick="Tick...", tock="Tock...";

    public static void main(String[] args) {
        go();
    }
    private static void go(){
        Timer t= new Timer(1000, new Ticker());
        t.start();

        JOptionPane.showMessageDialog(null,  "Click OK to end");
        System.exit(0);
    }

    private static class Ticker implements ActionListener{
        private boolean s= true;

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            if(s) System.out.println(tick);
            else System.out.println(tock);
            s=!s;
        }
        
    }
}
