
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 *  The View for your main gameplay or user interaction could go here.
 * 
 * @author jrimland
 */
public class MainView extends JPanel{
    private String player1Name;
    private String player1Color;
    private String player2Name;
    private String player2Color;
    
    MainView()
    {
        JLabel welcomeLabel = new JLabel("Welcome to the Main View!");
        JLabel player1TempLabel = new JLabel("NAME: " + player1Name + "COLOR: " + player1Color);
        JLabel player2TempLabel = new JLabel("NAME: " + player2Name + "COLOR: " + player2Color);
        
        add(welcomeLabel);
        add(player1TempLabel);
        add(player2TempLabel);
    }
}
