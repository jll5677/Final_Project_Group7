
import javax.swing.*;

/**
 *
 * @author jrimland
 */
public class NavViewSplashPanel extends JPanel{
    JButton splashButton;
    JLabel optionsLabel;
    NavViewSplashPanel()
    {
            splashButton = new JButton(new ImageIcon("src/images/BoxJumpSplash.jpg"));            
            add(splashButton);
            
            optionsLabel = new JLabel("No options selected yet.");
            add(optionsLabel);
            
    }    
}
