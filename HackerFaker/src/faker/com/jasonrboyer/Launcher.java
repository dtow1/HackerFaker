package faker.com.jasonrboyer;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Launcher extends JFrame {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                FakeIt frame = new FakeIt();

                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setVisible(true);

                Thread t = new Thread(frame);
                t.start();

                Terminal term = new Terminal();
                term.setVisible(true);

                Thread t2 = new Thread(term);
                t2.start();

            }
        });
    }

}

class FakeIt extends JFrame implements Runnable {

    JPanel    testPanel = new JPanel(new BorderLayout());
    JLabel    testLabel = new JLabel("Welcome to the Jungle");
    JButton   startGame = new JButton("Enter");
    JTextArea textBox   = new JTextArea();

    public FakeIt() {
        setTitle("Hacking in Progress");
        setSize(400, 400);

        testPanel.add(testLabel, BorderLayout.NORTH);
        testPanel.add(startGame, BorderLayout.EAST);
        testPanel.add(textBox, BorderLayout.SOUTH);

        add(testPanel);

        testPanel.setBackground(Color.black);
        testLabel.setForeground(Color.green);

        testLabel.setText("Starting new hack");
        textBox.setText("Starting hack");

    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        StringBuilder newString = new StringBuilder("");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            newString.append(".");
            textBox.setText(newString.toString());
            // textBox.paint(textBox.getGraphics());
            textBox.repaint();
        }
    };

}
