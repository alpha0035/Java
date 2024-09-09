package working_with_variables_datatypes;

import javax.swing.JOptionPane;

/**
 * inputWithJOptionPane
 */
public class inputWithJOptionPane {

    public static void main(String[] args) {
        String s= JOptionPane.showInputDialog("Enter an integer: ");
        int x= Integer.parseInt(s);
        System.out.println("You've entered: "+x);
    }
}