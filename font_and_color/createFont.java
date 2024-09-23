package font_and_color;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

//you can create basic font by using constructor:
// Font(String name, int style, int size)

public class createFont {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(333,222);
        frame.setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        /*To set the font used to display a component, just call the component’s setFont  method and pass it a Font object */
        JLabel label = new JLabel("Hello boss!");
        Font f= new Font("JSL Ancient", Font.BOLD | Font.ITALIC, 22);
        /*Create font name JSL Ancient, style bold and italic with size 22 */
        label.setFont(f);
        panel.add(label);
        frame.add(panel);
        frame.setVisible(true);
        (new createFont()).getFont();
    }
    // you can create a method that allow user choose a font
    private void getFont(){
        GraphicsEnvironment g= GraphicsEnvironment.getLocalGraphicsEnvironment();
        // get all font name
        String[] fonts= g.getAvailableFontFamilyNames();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setSize(333,222);
        frame.setTitle("Fun with Font");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("I'm alphatic, from Alpha Seven.");
        panel.add(label);
        panel.add(new JLabel("Choose one font type:"));
        JComboBox<String> comboBox = new JComboBox<>(fonts);
        comboBox.addActionListener(e->{
            String name= (String) comboBox.getSelectedItem();
            Font f= new Font(name, 0, 22);
            label.setFont(f);
        });
        panel.add(comboBox);
        frame.add(panel);
        frame.setVisible(true);
    }
}
