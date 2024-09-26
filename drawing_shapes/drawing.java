package drawing_shapes;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class drawing extends JFrame{
    public static void main(String[] args) {
        new drawing();
    }
    public drawing(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(333,222);
        setLocationRelativeTo(null);

        add(new PaintRect(), BorderLayout.CENTER);
        setVisible(true);
    }
}

class PaintRect extends JComponent{
    
    @Override
    public void paint(Graphics g) {
        // TODO Auto-generated method stub
        /*Create graphic2D obj */
        Graphics2D grp= (Graphics2D)g;
        
        /*To drawing shape, you must create Shape obj represent the shape you want to draw */
        Shape rec= new Rectangle2D.Float(10, 20, 100, 200);
        grp.draw(rec);
        
        /* here a some way to tweak a shape */
        // Change the color
        grp.setColor(Color.CYAN);
        //Fill a shape with color
        grp.fill(rec);

        grp.setColor(Color.RED);
        grp.draw(rec);
        
        /*Change the thickness of the line used to draw the shape */
        grp.setStroke(new BasicStroke(6));
    }
    
}
