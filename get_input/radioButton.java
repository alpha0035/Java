package get_input;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

// radio button is similar to check box, but user can choose just one at a time.
// note that you have to add radio button in ButtonGroup also.
// if you want to group all button in one, you don't have to create button group.
public class radioButton extends JFrame{
    public static void main(String[] args) {
        new radioButton();
    }
    public radioButton(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Hi boss!");
        this.setLocationRelativeTo(null);
        this.setSize(333,222);
        ButtonGroup gr= new ButtonGroup();
        JRadioButton alp, bta, gma;
        alp= new JRadioButton("Alpha");
        bta= new JRadioButton("Beta");
        gma= new JRadioButton("Gamma");
        gr.add(alp);
        gr.add(bta);
        gr.add(gma);
        JPanel panel = new JPanel();
        panel.add(new JLabel("What would you like?"));
        panel.add(alp);
        panel.add(bta);
        panel.add(gma);
        JButton okButton= new JButton("OK");
        okButton.addActionListener(e->{
            String msg="";
            if(alp.isSelected()) msg+="Alpha";
            if(bta.isSelected()) msg+="Beta";
            if(gma.isSelected()) msg+="Gamma";
            if(msg.length()== 0) msg="You didn't choose anything";
            else msg+="Your choice is: "+msg;
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
