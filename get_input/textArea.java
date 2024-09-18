package get_input;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//text area is likely to text field but it allow users to type more than one line
// in case your text have too many lines, the best way is to use scroll pane
public class textArea {
    public static void main(String[] args) {
        new Novel();
    }
}
class Novel extends JFrame{
    private JTextArea novelText;
    public Novel(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(399,299);
        this.setLocationRelativeTo(null);
        this.setTitle("Your novel: ");
        JPanel panel= new JPanel();
        novelText= new JTextArea(5 , 15);
        JScrollPane scr= new JScrollPane(novelText, 
        JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
        JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        panel.add(novelText);
        panel.add(scr);
        this.add(panel);
        this.setVisible(true);
    }
}