import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test1 {
    public static void main(String[] args) {


        
        JFrame frame1 = new JFrame("MINH");
        JPanel frame = new JPanel();
        JButton b1 = new JButton("North");
        JButton b2 = new JButton("South");
        JButton b3 = new JButton("East");
        JButton b4 = new JButton("West");
        JButton b5 = new JButton("Center");
        frame.setLayout(new GridLayout(3, 2, 10, 10));
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.setSize(500, 500);
        frame1.add(frame);
        frame1.setVisible(true);
    }
}
