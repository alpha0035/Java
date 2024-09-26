package drawing_shapes;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.*;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class creating extends JFrame{
    public static void main(String[] args) {
        new creating();
    }
    public creating(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000,1000);
        setLocationRelativeTo(null);
        add(new createShape(), BorderLayout.CENTER);
        setVisible(true);
    }
}

class createShape extends JComponent{

    @Override
    public void paint(Graphics g) {
        // TODO Auto-generated method stub
        Graphics2D grp= (Graphics2D) g;

        // turn on antialiasing             
        grp.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);             
        // draw background grid             
        grp.setPaint(Color.LIGHT_GRAY);             
        for (int i = 0; i < getSize().width; i += 10)                 
            grp.draw(new Line2D.Float(i, 0, i, getSize().height));             
        for (int i = 0; i < getSize().height; i += 10)                 
            grp.draw(new Line2D.Float(0, i, getSize().width, i));

        grp.setColor(Color.RED);

        /*Rounded rectangle */
        Shape roundRec= new RoundRectangle2D.Float(30, 30, 150 ,250 , 30, 30);
        grp.draw(roundRec);

        /*ellipse */
        Shape ellipse= new Ellipse2D.Double(200, 30, 150, 250);
        grp.draw(ellipse);
        /*arc, which is a segment of ellipse */
        Shape arc= new Arc2D.Float(400, 30, 150, 250, 30, 180, Arc2D.CHORD);
        grp.draw(arc);
        /*linde 2D */
        Shape line= new Line2D.Double(30, 300, 150, 450);
        grp.draw(line);

    }
}