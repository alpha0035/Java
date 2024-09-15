package swing_into_swing;

import javax.swing.JFrame;
import javax.swing.JPanel;

class createPanel extends JFrame{
    public static void main(String[] args) {
        new HelloFrame();  
        new createPanel(); 
    }
    public createPanel(){
        HelloPanel panel = new HelloPanel();
        this.add(panel);
    }
}
// you can simply create JPanel obj and assignned it into JFrame constructor.
class HelloFrame extends JFrame{
    public HelloFrame(){
        // here "createPanel" class extends from JFrame so we can use some methods of JFrame class
        this.setSize(399, 299);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // if you don't have this code, the program will continue run even you close
        this.setTitle("Hello, boss!");
        JPanel jPanel= new JPanel();
        // your components added to the panel
        this.setVisible(true);      
    }
}
// or you can create separate class extends from JPanel, then in the frame class constructor, you create new instance of this class
class HelloPanel extends JPanel{
    public HelloPanel(){
        // code to add components to your panel go here
    }
}