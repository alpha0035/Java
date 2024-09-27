package drawing_shapes;

import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class filling extends JFrame{
    public static void main(String[] args) {
        new filling();
    }
    public filling(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000,1000);
        setLocationRelativeTo(null);
        add(new fillShape(), BorderLayout.CENTER);
        setVisible(true);
    }
}

class fillShape extends JComponent{
    public void paint(Graphics g){
        Graphics2D grp= (Graphics2D) g;
        Shape rec= new Rectangle2D.Float(30, 30, 200, 300);

        /*you can fill a shape by using gradient fill */
        GradientPaint gp= new GradientPaint(0, 0, Color.BLUE, 0, 100, Color.YELLOW);
        grp.setPaint(gp);
        grp.draw(rec);
        grp.fill(rec);
    }
}

