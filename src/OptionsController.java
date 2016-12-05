
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class OptionsController {
    
    OptionsModel o_model;
    OptionsView o_view;
    MainModel m_model;
    
    OptionsController(final OptionsModel o_model, final OptionsView o_view, final MainModel m_model)
    {
        this.o_model = o_model;
        this.o_view = o_view;
        this.m_model = m_model;
        
        class ButtonListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                JButton clickSource = (JButton)e.getSource();
                if(clickSource == o_view.redButton) {
                    o_model.setPlayerColor(Color.RED);
                    //m_model.setPlayer1Color(Color.RED);
                }
                if(clickSource == o_view.greenButton) {
                    o_model.setPlayerColor(Color.GREEN);
                    //m_model.setPlayer2Color(Color.GREEN);
                }
                if(clickSource == o_view.blueButton) {
                    o_model.setPlayerColor(Color.BLUE);
                    //m_model.setPlayer1Color(Color.BLUE);
                }
                if(clickSource == o_view.savePlayerInfoButton) {
                    o_model.setPlayerSize(o_view.playerSizeSlider.getValue());
                }
                if(clickSource == o_view.showPlayerInfoButton) {
                    o_view.playerInfoLabel.setText("Challenger is ready to play!");
                }
            }
        }
        o_view.addRedButtonListener(new ButtonListener());
        o_view.addGreenButtonListener(new ButtonListener());
        o_view.addBlueButtonListener(new ButtonListener());
        o_view.addSavePlayerInfoButtonListener(new ButtonListener());
        o_view.addShowPlayerInfoButtonListener(new ButtonListener());
    }
    
}
