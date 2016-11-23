
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class MainController {
    MainView m_view;
    
    MainController(final MainView m_view) {
        this.m_view = m_view;
        
        final OptionsModel o_model = new OptionsModel();
        final OptionsView o_view = new OptionsView(o_model);
        
        class ButtonListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                JButton clickSource = (JButton)e.getSource();
                if(clickSource == m_view.updatePlayer1Label) {
                    m_view.player1TempLabel.setText("PLAYER 1 INFO - Name: " + o_model.getPlayer1Name() + " Color: " + o_model.getPlayer1ColorString());
                }
                if(clickSource == m_view.updatePlayer2Label) {
                    m_view.player2TempLabel.setText("PLAYER 2 INFO - Name: " + o_model.getPlayer2Name() + " Color: " + o_model.getPlayer2ColorString());
                }
            }
        }
        m_view.addUpdatePlayer1LabelButtonListener(new ButtonListener());
        m_view.addUpdatePlayer2LabelButtonListener(new ButtonListener());
    }
}
