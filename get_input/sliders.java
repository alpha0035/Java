package get_input;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;

// slider is one type of components that let user choose a value from a range
public class sliders extends JFrame{
    public static void main(String[] args) {
        new sliders();
    }
    public sliders(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(333,222);
        this.setTitle("Hello program!");
        this.setLocationRelativeTo(null);
        JPanel panel= new JPanel();
        panel.add(new JLabel("What is your rate?"));
        JSlider slider= new JSlider(0, 10);
        slider.setMajorTickSpacing(2);
        slider.setMinorTickSpacing(1);
        //show the number
        slider.setPaintLabels(true);
        //show the tick
        slider.setPaintTicks(true);
        panel.add(slider);
        JButton okButton= new JButton("Ok");
        okButton.addActionListener(e->{
            int c= slider.getValue();
            JOptionPane.showMessageDialog(okButton, "Your rate: "+c, "Thanks!", JOptionPane.INFORMATION_MESSAGE);
        });
        panel.add(okButton);
        this.add(panel);
        this.setVisible(true);
    }
}
