package faker.com.jasonrboyer;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Launcher extends JFrame {

    Launcher() {
        new BorderLayout();
        JPanel testPanel = new JPanel(new BorderLayout());
        JLabel testLabel = new JLabel("Welcome to the Jungle");
        JButton startGame = new JButton("Enter");
        setSize(400, 400);
        testPanel.add(testLabel, BorderLayout.NORTH);
        testPanel.add(startGame, BorderLayout.EAST);
        add(testPanel);
        testPanel.setBackground(Color.black);
        testLabel.setForeground(Color.green);
        setTitle("Hacking in Progress");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
        testLabel.setText("Starting new hack");
        Terminal fun = new Terminal();
        fun.setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Launcher launch = new Launcher();
                launch.setVisible(true);
            }
        });

    }

}
