
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
    private String player1Name;
    private String player1Color;
    private String player2Name;
    private String player2Color;
    
    MainView()
    {
        GridLayout grid = new GridLayout(3,1);
        setLayout(grid);
        
        OptionsModel o_model = new OptionsModel();
        
        JLabel welcomeLabel = new JLabel("Welcome to Box Jump!");
        JLabel player1TempLabel = new JLabel("No info yet.");
        JLabel player2TempLabel = new JLabel("No info yet.");
        
        add(welcomeLabel);
        add(player1TempLabel);
        add(player2TempLabel);
    }
    public void setPlayer1Name(String player1Name) {
        this.player1Name = player1Name;
    }
    public void setPlayer2Name(String player2Name) {
        this.player2Name = player2Name;
    }
    public String getPlayer1Name() {
        return player1Name;
    }
    public String getPlayer2Name() {
        return player2Name;
    }
    
    public String getPlayer1Color(OptionsModel o_model) {
        Color color = o_model.getPlayer1Color();
        
        if(color == Color.RED) {
            player1Color = "Red";
        }
        if(color == Color.BLUE) {
            player1Color = "Blue";
        }
        if(color == Color.GREEN) {
            player1Color = "Green";
        }
        
        return player1Color;
    }
    
    public String getPlayer2Color(OptionsModel o_model) {
        Color color = o_model.getPlayer2Color();
        
        if(color == Color.RED) {
            player2Color = "Red";
        }
        if(color == Color.BLUE) {
            player2Color = "Blue";
        }
        if(color == Color.GREEN) {
            player2Color = "Green";
        }
        
        return player2Color;
    }
}
