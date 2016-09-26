import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 */
public class Launcher extends JFrame {

    private int DEFAULT_SIZE = 400;

    MainFrame(ActionListener startGameListener){
        new BorderLayout();
        JPanel testPanel = new JPanel(new BorderLayout());
        JLabel testLabel = new JLabel("Welcome to the Jungle");
        JButton startGame = new JButton("Hacking");
        setSize(DEFAULT_SIZE,DEFAULT_SIZE);
        startGame.addActionListener(startGameListener);
        testPanel.add(testLabel, BorderLayout.NORTH);
        testPanel.add(startGame, BorderLayout.EAST);
        add(testPanel);
        setTitle("Test");

        this.setVisible(true);
            
            
    }

}
