package get_input;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.border.Border;

public class orderProgram extends JFrame{
    public static void main(String[] args) {
        new orderProgram();
    }
    private JButton okButton;
    private JRadioButton small, medium, large;
    private JCheckBox alp, bta, gma;
    public orderProgram(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(333,222);
        this.setTitle("Your order!");
        this.setLocationRelativeTo(null);
        /*Here is the main panel which we will add some sub panel into */
        JPanel maiPanel= new JPanel();

        /*Panel1 for the type of order */
        JPanel panel1= new JPanel();
        panel1.add(new JLabel("Please make your choice!"));
        Border b1= BorderFactory.createTitledBorder("Type");
        panel1.setBorder(b1);
        alp= new JCheckBox("Alpha");
        bta= new JCheckBox("Beta");
        gma= new JCheckBox("Gamma");
        ButtonGroup gr= new ButtonGroup();
        small= new JRadioButton("Small");
        medium= new JRadioButton("Medium");
        large= new JRadioButton("Large");
        gr.add(small);
        gr.add(medium);
        gr.add(large);
        panel1.add(alp);
        panel1.add(bta);
        panel1.add(gma);
        panel1.add(small);
        panel1.add(medium);
        panel1.add(large);
        maiPanel.add(panel1);
        
        /*Panel2 for the rate */
        JPanel panel2= new JPanel();
        Border b2= BorderFactory.createTitledBorder("Rate");
        panel2.setBorder(b2);
        JSlider slider= new JSlider(0, 10, 10);
        slider.setMajorTickSpacing(2);
        slider.setMinorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        panel2.add(slider);
        maiPanel.add(panel2);

        okButton= new JButton("OK");
        okButton.addActionListener(e->{
            String msg1="", msg2="";
            if(alp.isSelected()) msg1+= alp.getText()+" ";
            if(bta.isSelected()) msg1+= bta.getText()+" ";
            if(gma.isSelected()) msg1+= gma.getText()+" ";

            if(small.isSelected()) msg2= small.getText();
            else if(medium.isSelected()) msg2= medium.getText();
            else if(large.isSelected()) msg2= large.getText();
            
            if(msg1.length()==0) JOptionPane.showMessageDialog(orderProgram.this, "You didn't choose anything!", "Ops", JOptionPane.WARNING_MESSAGE);
            else{
                if(msg2.length()==0) JOptionPane.showMessageDialog(orderProgram.this, "You choose "+msg1 +"\nPlease choose your size!", "Hmm", JOptionPane.CLOSED_OPTION);
                else{
                    JOptionPane.showMessageDialog(orderProgram.this, 
                    "You choose "+msg1+"\nYour size is "+msg2+"\nWith rate "+slider.getValue(), 
                    "Thank you!", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            alp.setSelected(false);
            bta.setSelected(false);
            gma.setSelected(false);

            small.setSelected(false);
            medium.setSelected(false);
            large.setSelected(false);
        });
        maiPanel.add(okButton);
        this.add(maiPanel);
        this.setVisible(true);
    }
}
