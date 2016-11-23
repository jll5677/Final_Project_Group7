
import java.awt.Color;

public class MainModel {
    private String player1Name;
    private String player2Name;
    private Color player1Color;
    private Color player2Color;
    private String player1ColorString;
    private String player2ColorString;
    
    MainModel(){}
    public void setPlayer1Name(String player1Name) {
        this.player1Name = player1Name;
    }
    public void setPlayer2Name(String player2Name) {
        this.player2Name = player2Name;
    }
    public void setPlayer1Color(Color player1Color) {
        this.player1Color = player1Color;
    }
    public void setPlayer2Color(Color player2Color) {
        this.player2Color = player2Color;
    }
    
    public String getPlayer1Name() {
        return player1Name;
    }
    public String getPlayer2Name() {
        return player2Name;
    }
    public Color getPlayer1Color() {
        return player1Color;
    }
    public Color getPlayer2Color() {
        return player2Color;
    }
    
    public String getPlayer1ColorString() {
        Color color = getPlayer1Color();
        
        if(color == Color.RED) {
            player1ColorString = "Red";
        }
        if(color == Color.YELLOW) {
            player1ColorString = "Yellow";
        }
        if(color == Color.BLUE) {
            player1ColorString = "Blue";
        }
        
        return player1ColorString;
    }
    
    public String getPlayer2ColorString() {
        Color color = getPlayer2Color();
        
        if(color == Color.ORANGE) {
            player2ColorString = "Orange";
        }
        if(color == Color.GREEN) {
            player2ColorString = "Green";
        }
        if(color == Color.MAGENTA) {
            player2ColorString = "Magenta";
        }
        
        return player2ColorString;
    }
}
