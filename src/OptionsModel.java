
import java.awt.Color;

public class OptionsModel {

    private String player1Name;
    private String player2Name;
    private String highestScorer;
    private Color player1Color;
    private Color player2Color;
    private int player1Score;
    private int player2Score;
    private int highScore;
    private String player1ColorString;
    private String player2ColorString;
    private int player1Record;
    private int player2Record;
    
    OptionsModel(){}
    
    public void setPlayer1Name(String player1Name) {
        this.player1Name = player1Name;
    }
    public void setPlayer2Name(String player2Name) {
        this.player2Name = player2Name;
    }
    public void setHighestScore(String highestScorer) {
        this.highestScorer = highestScorer;
    }
    public void setPlayer1Color(Color player1Color) {
        this.player1Color = player1Color;
    }
    public void setPlayer2Color(Color player2Color) {
        this.player2Color = player2Color;
    }
    public void setPlayer1Score(int player1Score) {
        this.player1Score = player1Score;
    }
    public void setPlayer2Score(int player2Score) {
        this.player2Score = player2Score;
    }
    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }
    public void setPlayer1Record(int player1Record) {
        this.player1Record = player1Record;
    }
    public void setPlayer2Record(int player2Record) {
        this.player2Record = player2Record;
    }
    
    public String getPlayer1Name() {
        return player1Name;
    }
    public String getPlayer2Name() {
        return player2Name;
    }
    public String getHighestScore() {
        return highestScorer;
    }
    public Color getPlayer1Color() {
        return player1Color;
    }
    public Color getPlayer2Color() {
        return player2Color;
    }
    public int getPlayer1Score() {
        return player1Score;
    }
    public int getPlayer2Score() {
        return player2Score;
    }
    public int getHighScore() {
        return highScore;
    }
    public int getPlayer1Record() {
        return player1Record;
    }
    public int getPlayer2Record() {
        return player2Record;
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
