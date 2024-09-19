package choose_from_list;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

public class list extends JFrame{
    public static void main(String[] args) {
        new list();
    }
    public list(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(333,222);
        this.setResizable(false);
        JPanel panel= new JPanel();
         
        String[] arr= {"Alpha", "Beta", "Gamma", "Delta", "Omega"};
        JList<String> l= new JList<>(arr);
        l.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        panel.add(l);
        //by default, the items on the list can't be changed after you create.
        // to create a list can be change, you use DefaultListModel object
        DefaultListModel<Integer> l2= new DefaultListModel<>();
        l2.addElement(06);
        l2.addElement(13);
        l2.add(2, 07);
        l2.addElement(24);
        l2.addElement(30);
        JList l3= new JList<>(l2);
        panel.add(l3);

        this.add(panel);
        this.setVisible(true);
    }
}
