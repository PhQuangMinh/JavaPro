package App;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class View {
    private JLabel timeLabel;

    private void updateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm dd/MM/yyyy");
        String currentTime = dateFormat.format(new Date());
        timeLabel.setText(currentTime);
    }

    public void process() {
        JFrame frame = new JFrame("Update Time");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        timeLabel = new JLabel();
        updateTime();
        frame.add(timeLabel);
        JButton button = new JButton("Update Time");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTime(); // Cập nhật thời gian khi người dùng ấn nút
            }
        });
        frame.add(button);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        View view = new View();
        view.process();
    }
}
