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
    private final int P2_RIGHT = 3;
    private final int P2_LEFT = 4;
    
    GamePlay(){
        setBackground(Color.BLACK);
        setLayout(null);
        
        P1GamePiece = new JButton();
        P2GamePiece = new JButton();
        P1GamePiece.setBackground(P1Color);
        P2GamePiece.setBackground(P2Color);
        P1GamePiece.setBounds(0, 0, 50, 50);
        P2GamePiece.setBounds(0, 50, 50, 50);
        
        add(P1GamePiece);
        add(P2GamePiece);
        
        P1GamePiece.getInputMap(WIFW).put(KeyStroke.getKeyStroke("RIGHT"), MOVE_P1_RIGHT);
        P1GamePiece.getInputMap(WIFW).put(KeyStroke.getKeyStroke("LEFT"), MOVE_P1_LEFT);
        
        P2GamePiece.getInputMap(WIFW).put(KeyStroke.getKeyStroke("D"), MOVE_P2_RIGHT);
        P2GamePiece.getInputMap(WIFW).put(KeyStroke.getKeyStroke("A"), MOVE_P2_LEFT);
        
        P1GamePiece.getActionMap().put(MOVE_P1_RIGHT, new MoveAction(P1_RIGHT));
        P1GamePiece.getActionMap().put(MOVE_P1_LEFT, new MoveAction(P1_LEFT));
        
        P2GamePiece.getActionMap().put(MOVE_P2_RIGHT, new MoveAction(P2_RIGHT));
        P2GamePiece.getActionMap().put(MOVE_P2_LEFT, new MoveAction(P2_LEFT));
    }
    
    private class MoveAction extends AbstractAction {
        private final int direction;
        private final int speed = 5;

        public MoveAction(int direction) {
            this.direction = direction;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(direction == P1_RIGHT) {
                P1GamePiece.setLocation(P1GamePiece.getLocation().x + speed, P1GamePiece.getLocation().y);
            }
            if(direction == P1_LEFT) {
                P1GamePiece.setLocation(P1GamePiece.getLocation().x - speed, P1GamePiece.getLocation().y);
            }
            if(direction == P2_RIGHT) {
                P2GamePiece.setLocation(P2GamePiece.getLocation().x + speed, P2GamePiece.getLocation().y);
            }
            if(direction == P2_LEFT) {
                P2GamePiece.setLocation(P2GamePiece.getLocation().x - speed, P2GamePiece.getLocation().y);
            }
        }
    }
    
    public void setPlayer1Color(Color P1Color) {
        this.P1Color = P1Color;
    }
    public void setPlayer2Color(Color P2Color) {
        this.P2Color = P2Color;
    }
}
