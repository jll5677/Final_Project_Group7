
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class MainController {
    MainModel m_model;
    MainView m_view;
    OptionsModel o_model;
    
    MainController(final MainModel m_model, final MainView m_view) {
        this.m_model = m_model;
        this.m_view = m_view;
        
       class ButtonListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                JButton clickSource = (JButton)e.getSource();
                if(clickSource == m_view.updatePlayer1Label) {
                    m_view.player1TempLabel.setText("PLAYER 1 INFO - Name: " + m_model.getPlayer1Name() + " Color: " + m_model.getPlayer1ColorString() + " Level: " + m_model.getlevel());
                }
                if(clickSource == m_view.updatePlayer2Label) {
                    m_view.player2TempLabel.setText("PLAYER 2 INFO - Name: " + m_model.getPlayer2Name() + " Color: " + m_model.getPlayer2ColorString() + " Level: " + m_model.getlevel());
                }
            }
        }
        m_view.addUpdatePlayer1LabelButtonListener(new ButtonListener());
        m_view.addUpdatePlayer2LabelButtonListener(new ButtonListener());
    }
    
}
