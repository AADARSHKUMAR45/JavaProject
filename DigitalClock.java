import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock {
    public static void main(String[] args) {
        JFrame frame = new JFrame("🕒 Digital Clock");
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLayout(new FlowLayout());

        JLabel timeLabel = new JLabel();
        timeLabel.setFont(new Font("Helvetica", Font.BOLD, 35));
        timeLabel.setForeground(Color.CYAN);
        frame.add(timeLabel);

        Timer timer = new Timer(1000, e -> {
            String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
            timeLabel.setText(time);
        });

        timer.start();
        frame.setVisible(true);
    }
}

