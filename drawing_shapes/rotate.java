package drawing_shapes;

import javax.swing.JComponent;
import javax.swing.JFrame;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class rotate extends JFrame{
    public static void main(String[] args) {
        new rotate();
    }
    public rotate(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000,1000);
        setTitle("rotating shape");
        setLocationRelativeTo(null);
        add(new rotateShape(), BorderLayout.CENTER);
        setVisible(true);
    }
}
class rotateShape extends JComponent{
    public void paint(Graphics g){
        Graphics2D grp= (Graphics2D) g;

        Shape ellipse= new Ellipse2D.Double(500, 500, 100, 200);
        for (int i = 0; i <=360; i+=45) {
            grp.rotate(Math.toRadians(i), 500, 500);
            grp.setColor(Color.BLACK);
            grp.draw(ellipse);
            grp.setColor(Color.YELLOW);
            grp.fill(ellipse);
        }
    }
}
