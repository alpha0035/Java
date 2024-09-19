package choose_from_list;

import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

// a combo box is combined from text field and drop down list
// you can create JComboBox object from default constructors that pass parameter is null, vector or array.
public class comboBox extends JFrame{
    public static void main(String[] args) {
        new comboBox();
    }
    public comboBox(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(333,222);
        this.setResizable(false);
        JPanel panel = new JPanel();
        
        // creating combo box as null parameter
        JComboBox<String> cBox1= new JComboBox<>();
        cBox1.addItem("Alpha");
        cBox1.addItem("Beta");
        cBox1.addItem("Gamma");
        //creating combo box from a vector
        Vector<Integer> vec= new Vector<>();
        vec.add(13);
        vec.add(06);
        vec.add(07);
        JComboBox cBox2 = new JComboBox(vec);
        //creating from array
        Boolean[] arr= {true, false, true};
        JComboBox cBox3 = new JComboBox<>(arr);
        
        panel.add(cBox1);
        panel.add(cBox2);
        panel.add(cBox3);

        this.add(panel);
        this.setVisible(true);
    }
}
