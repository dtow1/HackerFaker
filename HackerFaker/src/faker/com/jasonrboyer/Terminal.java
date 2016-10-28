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
        // JScrollPane scrollPane = new JScrollPane(testArea);
        // new SmartScroller(scrollPane);
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
        testArea.setCaretPosition(testArea.getDocument().getLength());
        hackingText.append("\nScanning 85.118.32.9");
        testArea.setText(hackingText.toString());
        testArea.setCaretPosition(testArea.getDocument().getLength());
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
            testArea.setCaretPosition(testArea.getDocument().getLength());
            this.repaint();
        }

        hackingText.append("\nUDP port 314 found open");
        testArea.setText(hackingText.toString());
        testArea.setCaretPosition(testArea.getDocument().getLength());
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        hackingText.append("\nBreaching port using inversion decupling");
        testArea.setText(hackingText.toString());
        testArea.setCaretPosition(testArea.getDocument().getLength());
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
            testArea.setCaretPosition(testArea.getDocument().getLength());
            this.repaint();
        }
        hackingText.append("\nBreach complete");
        testArea.setCaretPosition(testArea.getDocument().getLength());

        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(250);
            }
            catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            hackingText.append("\n#");
            testArea.setText(hackingText.toString());
            testArea.setCaretPosition(testArea.getDocument().getLength());
            this.repaint();
        }

        hackingText
                .append("\nFBI Internal Network. Unauthorized access constitutes treason\n"
                        + "and is punishable by death");
        testArea.setText(hackingText.toString());
        testArea.setCaretPosition(testArea.getDocument().getLength());

    }

}
