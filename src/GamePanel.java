
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

public class GamePanel extends JPanel{
    
    
    GamePanel() {
        JButton SAMPLEBUTTON = new JButton("SAMPLE");
        SAMPLEBUTTON.setBackground(Color.yellow);
        SAMPLEBUTTON.setForeground(Color.RED);
        
        add(SAMPLEBUTTON);
    }
}
