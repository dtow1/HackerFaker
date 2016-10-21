package faker.com.jasonrboyer;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Terminal extends JFrame implements Runnable {
    private StringBuilder hackingText = new StringBuilder();

    /*
     * Terminal() { new BorderLayout(); JPanel testPanel = new JPanel(new
     * BorderLayout()); JTextArea testArea = new
     * JTextArea("Welcome to the Jungle"); setSize(400, 400);
     * testPanel.add(testArea, BorderLayout.CENTER); add(testPanel);
     * testPanel.setBackground(Color.black);
     * testArea.setForeground(Color.green); setTitle("Hacking in Progress");
     * setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); this.setVisible(true);
     * hackingText.append("Starting Hack...");
     * hackingText.append("\nScanning 85.118.32.9"); for (int i = 0; i < 5; i++)
     * { try { Thread.sleep(1000); } catch (InterruptedException e) { // TODO
     * Auto-generated catch block e.printStackTrace(); }
     * hackingText.append("."); testArea.setText(hackingText.toString());
     * this.repaint(); }
     * 
     * }
     */

    public static void Hack(StringBuilder hackingText) {

    }

    @Override
    public void run() {
        new BorderLayout();
        JPanel testPanel = new JPanel(new BorderLayout());
        JTextArea testArea = new JTextArea("Welcome to the Jungle");
        setSize(400, 400);
        testPanel.add(testArea, BorderLayout.CENTER);
        add(testPanel);
        testArea.setBackground(Color.black);
        testArea.setForeground(Color.green);
        setTitle("Hacking in Progress");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
        hackingText.append("Starting Hack...");
        testArea.setText(hackingText.toString());
        hackingText.append("\nScanning 85.118.32.9");
        testArea.setText(hackingText.toString());
        this.repaint();
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            hackingText.append(".");
            testArea.setText(hackingText.toString());
            this.repaint();
        }

    }

}
