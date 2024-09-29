package drawing_shapes;

import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.*;

public class drawText extends JFrame{
    public static void main(String[] args) {
        new drawText();
    }
    public drawText(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 1000);
        setLocationRelativeTo(null);
        add(new text(), BorderLayout.CENTER);
        setVisible(true);
        
    }
}
class text extends JComponent{
    public void paint(Graphics g){
        Graphics2D grp= (Graphics2D) g;
        grp.drawString("Hello you", 100, 100);
    }
}