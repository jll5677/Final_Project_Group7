
import java.awt.Color;
import javax.swing.JButton;

public class GamePlay {
    JButton P1GamePiece;
    JButton P2GamePiece;
    Color P1Color;
    Color P2Color;
    MainModel m_model;
    
    GamePlay(){
        P1GamePiece = new JButton();
        P2GamePiece = new JButton();
        P1GamePiece.setBackground(P1Color);
        P2GamePiece.setBackground(P2Color);
    }
    
    public void setP1Color() {
        P1Color = m_model.getPlayer1Color();
    }
    public void setP2Color() {
        P2Color = m_model.getPlayer2Color();
    }
}
