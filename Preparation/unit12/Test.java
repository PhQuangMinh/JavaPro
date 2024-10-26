import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test extends JFrame {
    private JLabel timeLabel;

    public Test() {
        setTitle("Time Updater");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        timeLabel = new JLabel();
        updateTime(); // Cập nhật thời gian ban đầu
        add(timeLabel);

        JButton updateButton = new JButton("Update Time");
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTime(); // Cập nhật thời gian khi người dùng ấn nút
            }
        });
        add(updateButton);

        pack();
        setLocationRelativeTo(null); // Đặt cửa sổ ở trung tâm màn hình
        setVisible(true);
    }

    private void updateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm dd/MM/yyyy");
        String currentTime = dateFormat.format(new Date());
        timeLabel.setText(currentTime);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Test();
            }
        });
    }
}