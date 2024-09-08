package inner_classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class anonymousInner {
    public static void main(String[] args) {
        anonClass.go();
        TickTockAnonymous.go();
    }
}

class anonClass{
    public static void go(){
        Ball obj1= new Ball() {
            public void hit(){
                System.out.println("You hit it!");
            }
        }; // semiclon here is the part of assignment statement
        obj1.hit();
    }
    interface Ball{
        void hit();
    }
}

class TickTockAnonymous{
    static String tick="Tick...", tock= "Tock...";
    public static void go(){
        Timer t= new Timer(1000, 
        new ActionListener() {
            private boolean s=true;

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                if(s) System.out.println(tick);
                else System.out.println(tock);
                s=!s;
            }
            
        });
        t.start();
        JOptionPane.showMessageDialog(null, "Click OK to end program!");
        System.exit(0);

    }
}