
import java.awt.Color;
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
    
    public String getPlayer1Name(OptionsModel o_model) {
        return o_model.getPlayer1Name();
    }
    public String getPlayer2Name(OptionsModel o_model) {
        return o_model.getPlayer2Name();
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
