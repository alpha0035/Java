package get_input;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

//a text field is a box that user can type the text in
public class textField {
    public static void main(String[] args) {
        new Namer();
        new Numeric();
    }
}

class Namer extends JFrame{
    private JButton okButton;
    private JTextField textname;
    public Namer(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(599,499);
        this.setTitle("Greeting");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Enter your name: ");
        panel.add(label);
        textname= new JTextField(15);
        panel.add(textname);
        okButton= new JButton("OK");
        okButton.addActionListener(e-> okButtonClick());
        panel.add(okButton);
        this.add(panel);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    private void okButtonClick(){
        String name= textname.getText();
        if(name.length()==0){
            JOptionPane.showMessageDialog(Namer.this, 
            "You didn't type anything", 
            "Error!", 
            JOptionPane.ERROR_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(Namer.this, 
            "Good morning "+name,
            "Salutations", 
            JOptionPane.INFORMATION_MESSAGE);
        }
        textname.requestFocus();
        // move the focus back to text field after the user click the button
    }
}
// in other way, you can also use to get numeric entry
class Numeric extends JFrame{
    private JButton okButton;
    private JTextField numText;
    public Numeric(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(499,399);
        this.setTitle("Get number!");
        JPanel panel = new JPanel();
        panel.add(new JLabel("Enter your integer: "));
        okButton= new JButton("OK");
        numText= new JTextField(  15);
        okButton.addActionListener(e->{
            String num= numText.getText();
            if(num.length()==0){
                JOptionPane.showMessageDialog(Numeric.this, "You didn't type anything!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                try{
                    int c= Integer.parseInt(num);
                    JOptionPane.showMessageDialog(Numeric.this, "You've entered: "+c," ", JOptionPane.INFORMATION_MESSAGE);
                }
                catch(NumberFormatException b){
                    JOptionPane.showMessageDialog(Numeric.this, "Please enter an integer!", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        panel.add(numText);
        panel.add(okButton);
        this.add(panel);
        this.setVisible(true);
    }
}