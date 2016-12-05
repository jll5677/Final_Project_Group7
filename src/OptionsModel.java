
import java.awt.Color;

public class OptionsModel {
    private Color playerColor;
    private Color backgroundColor;
    private int playerSize;
    
    OptionsModel(){}
    
    public void setPlayerColor(Color playerColor) {
        this.playerColor = playerColor;
    }
    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
    public void setPlayerSize(int playerSize) {
        this.playerSize = playerSize;
    }
    
    public Color getPlayerColor() {
        return this.playerColor;
    }
    public Color getBackgroundColor() {
        return this.backgroundColor;
    }
    public int getPlayerSize() {
        return this.playerSize;
    }
}
