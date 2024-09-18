package get_input;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class checkBox extends JFrame{
    public static void main(String[] args) {
        new checkBox();
    }
    public checkBox(){
        JCheckBox alp, bta, gma;
        JButton okButton;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(399, 299);
        this.setTitle("Hi boss!");
        this.setLocationRelativeTo(null);
        JPanel panel= new JPanel();
        alp= new JCheckBox("Alpha");
        bta= new JCheckBox("Beta");
        gma= new JCheckBox("Gamma");
        panel.add(new JLabel("What's your choice?"));
        panel.add(alp);
        panel.add(bta);
        panel.add(gma);
        okButton= new JButton("OK");
        okButton.addActionListener(e->{
            String msg="";
            if(alp.isSelected()) msg+="Alpha ";
            if(bta.isSelected()) msg+="Beta ";
            if(gma.isSelected()) msg+="Gamma";
            if(msg.equals("")) 
                msg= "You didn't choose anything!";
            else msg= "Your choices is:\n"+msg;
            JOptionPane.showMessageDialog(okButton, msg, "Result", JOptionPane.INFORMATION_MESSAGE);
            alp.setSelected(false);
            bta.setSelected(false);
            gma.setSelected(false);
        });
        panel.add(okButton);
        this.add(panel);
        this.setVisible(true);
    }
}
