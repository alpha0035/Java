package using_image_sound;

import javax.swing.*;

public class usingImageIcon {
    public static void main(String[] args) {
        new PaintImage();
    }
}
/* The easiest way to work with image is to create ImageIcon obj and add it to JLabel or JButton or painting directly*/
class PaintImage extends JFrame{
    public PaintImage(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Image application");
        setSize(1000,1000);
        setLocationRelativeTo(null);
        ImageIcon img= new ImageIcon("C:\\Users\\alpha\\Downloads\\100+ Hình Nền Máy Tính Full HD, 2K, 4K Đẹp Nhất 2023.jpg");
        JLabel label= new JLabel(img);
        JPanel panel = new JPanel();
        panel.add(label);
        add(panel);
        setVisible(true);
    }
}
