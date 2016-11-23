
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
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
    JButton updatePlayer1Label;
    JButton updatePlayer2Label;
    
    MainView()
    {
        GridLayout grid = new GridLayout(3,1);
        setLayout(grid);
        
        OptionsModel o_model = new OptionsModel();
        
        welcomeLabel = new JLabel("Welcome to Box Jump!");
        player1TempLabel = new JLabel("No info yet.");
        player2TempLabel = new JLabel("No info yet.");
        updatePlayer1Label = new JButton("Show Player 1 Settings");
        updatePlayer2Label = new JButton("Show Player 2 Settings");
        
        add(welcomeLabel);
        add(player1TempLabel);
        add(player2TempLabel);
        add(updatePlayer1Label);
        add(updatePlayer2Label);
    }
    public void addUpdatePlayer1LabelButtonListener(ActionListener alP1Label) {
        updatePlayer1Label.addActionListener(alP1Label);
    }
    public void addUpdatePlayer2LabelButtonListener(ActionListener alP2Label) {
        updatePlayer1Label.addActionListener(alP2Label);
    }
}
