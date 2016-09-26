package faker.com.jasonrboyer;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Terminal extends JFrame {
    private StringBuilder hackingText = new StringBuilder();

    Terminal() {
        new BorderLayout();
        JPanel testPanel = new JPanel(new BorderLayout());
        JLabel testLabel = new JLabel("Welcome to the Jungle");
        setSize(400, 400);
        testPanel.add(testLabel, BorderLayout.CENTER);
        add(testPanel);
        testPanel.setBackground(Color.black);
        testLabel.setForeground(Color.green);
        setTitle("Hacking in Progress");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
        hackingText.append("Starting Hack...");
        hackingText.append("/nScanning 85.118.32.9");
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            hackingText.append(".");
            testLabel.setText(hackingText.toString());
            this.repaint();
        }

    }

    public static void Hack(StringBuilder hackingText) {

    }

}
