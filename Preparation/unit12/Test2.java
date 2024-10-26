import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Validate Example");

        JPanel panel = new JPanel();
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        panel.add(button1);

        // Hiển thị frame và panel ban đầu
        frame.getContentPane().add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Đợi một khoảng thời gian và sau đó thêm button2 vào panel

        panel.add(button2);

        // Gọi validate để cập nhật lại giao diện
        frame.validate();
    }
}