import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MainView extends JPanel{
    JLabel welcomeLabel;
    JLabel player1TempLabel;
    JLabel player2TempLabel;
    JButton updatePlayer1Label;
    JButton updatePlayer2Label;
    
    private String player1Name;
    private String player2Name;
    private Color player1Color;
    private Color player2Color;
    private String player1ColorString;
    private String player2ColorString;
    
    MainModel m_model;
    
    MainView(final MainModel m_model)
    {
        this.m_model = m_model;
        
        GridLayout grid = new GridLayout(5,1);
        setLayout(grid);
        
        welcomeLabel = new JLabel("Welcome to Box Jump!");
        player1TempLabel = new JLabel("No info yet.");
        player2TempLabel = new JLabel("No info yet.");
        updatePlayer1Label = new JButton("Show Player 1 Settings");
        updatePlayer2Label = new JButton("Show Player 2 Settings");
        
        add(welcomeLabel);
        add(player1TempLabel);
        add(updatePlayer1Label);
        add(player2TempLabel);
        add(updatePlayer2Label);
        
        
    }
    public void addUpdatePlayer1LabelButtonListener(ActionListener alP1Label) {
        updatePlayer1Label.addActionListener(alP1Label);
    }
    public void addUpdatePlayer2LabelButtonListener(ActionListener alP2Label) {
        updatePlayer2Label.addActionListener(alP2Label);
    }
}
