
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 *  The View for your main gameplay or user interaction could go here.
 * 
 * @author jrimland
 */
public class MainView extends JPanel{
    JLabel welcomeLabel;
    JLabel player1TempLabel;
    JLabel player2TempLabel;
    
    MainView()
    {
        GridLayout grid = new GridLayout(3,1);
        setLayout(grid);
        
        OptionsModel o_model = new OptionsModel();
        
        welcomeLabel = new JLabel("Welcome to Box Jump!");
        player1TempLabel = new JLabel("No info yet.");
        player2TempLabel = new JLabel("No info yet.");
        
        add(welcomeLabel);
        add(player1TempLabel);
        add(player2TempLabel);
    }
   
    
}
