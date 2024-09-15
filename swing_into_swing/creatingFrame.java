package swing_into_swing;

import javax.swing.JFrame;

public class creatingFrame {
    public static void main(String[] args) {
        JFrame ob= new JFrame("Hello");
        ob.setSize(300,300);
        ob.setVisible(true);    // this line help you see the frame
        ob.setLocation(300,500);    //you can also set the location of your frame
    }
}
