import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class GamePlay extends JPanel{
    JButton P1GamePiece;
    JButton P2GamePiece;
    Color P1Color;
    Color P2Color;
    MainModel m_model;
    
    private final int WIFW = JComponent.WHEN_IN_FOCUSED_WINDOW;

    private final String MOVE_P1_RIGHT = "Move P1 Right";
    private final String MOVE_P1_LEFT = "Move P1 Left";
    private final String MOVE_P2_RIGHT = "Move P2 Right";
    private final String MOVE_P2_LEFT = "Move P2 Left";
    
    private final int P1_RIGHT = 1;
    private final int P1_LEFT = 2;
    private final int P2_RIGHT = 1;
    private final int P2_LEFT = 2;
    
    GamePlay(){
        setBackground(Color.BLACK);
        setLayout(null);
        
        P1GamePiece = new JButton();
        P2GamePiece = new JButton();
        P1Color = m_model.getPlayer1Color();
        P1GamePiece.setBackground(P1Color);
        P2Color = m_model.getPlayer2Color();
        P2GamePiece.setBackground(P2Color);
        P1GamePiece.setBounds(50, 50, 50, 50);
        P2GamePiece.setBounds(50, 50, 50, 50);
        
        add(P1GamePiece);
        add(P2GamePiece);
        
        P1GamePiece.getInputMap(WIFW).put(KeyStroke.getKeyStroke("Right"), MOVE_P1_RIGHT);
        P1GamePiece.getInputMap(WIFW).put(KeyStroke.getKeyStroke("Left"), MOVE_P1_LEFT);
        
        P2GamePiece.getInputMap(WIFW).put(KeyStroke.getKeyStroke("Right"), MOVE_P2_RIGHT);
        P2GamePiece.getInputMap(WIFW).put(KeyStroke.getKeyStroke("Left"), MOVE_P2_LEFT);
    }
    
    private class MoveAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
    }
}
