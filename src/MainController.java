
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
                if(clickSource == o_view.updatePlayer1InfoButton) {
                    m_view.player1TempLabel.setText("PLAYER 1 INFO - Name: " + o_view.player1NameField.getText() + " Color: " + o_model.getPlayer1ColorString());
                }
                if(clickSource == o_view.updatePlayer2InfoButton) {
                    m_view.player2TempLabel.setText("PLAYER 2 INFO - Name: " + o_view.player2NameField.getText() + " Color: " + o_model.getPlayer2ColorString());
                }
            }
        }
        o_view.addUpdatePlayer1InfoButtonButtonListener(new ButtonListener());
        o_view.addUpdatePlayer2InfoButtonButtonListener(new ButtonListener());
    }
}
