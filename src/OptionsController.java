
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
                    o_model.setPlayer1Color(Color.RED);
                    m_model.setPlayer1Color(Color.RED);
                }
                if(clickSource == o_view.orangeButton) {
                    o_model.setPlayer2Color(Color.ORANGE);
                    m_model.setPlayer2Color(Color.ORANGE);
                }
                if(clickSource == o_view.yellowButton) {
                    o_model.setPlayer1Color(Color.YELLOW);
                    m_model.setPlayer1Color(Color.YELLOW);
                }
                if(clickSource == o_view.greenButton) {
                    o_model.setPlayer2Color(Color.GREEN);
                    m_model.setPlayer2Color(Color.GREEN);
                }
                if(clickSource == o_view.blueButton) {
                    o_model.setPlayer1Color(Color.BLUE);
                    m_model.setPlayer1Color(Color.BLUE);
                }
                if(clickSource == o_view.magentaButton) {
                    o_model.setPlayer2Color(Color.MAGENTA);
                    m_model.setPlayer2Color(Color.MAGENTA);
                }
                if(clickSource == o_view.savePlayer1InfoButton) {
                    o_model.setPlayer1Name(o_view.player1NameField.getText());
                    m_model.setPlayer1Name(o_view.player1NameField.getText());
                }
                if(clickSource == o_view.showPlayer1InfoButton) {
                    o_view.player1InfoLabel.setText("" + o_model.getPlayer1Name() + " is ready to play!  Color selection is: " + o_model.getPlayer1ColorString());
                }
                if(clickSource == o_view.savePlayer2InfoButton) {
                    o_model.setPlayer2Name(o_view.player2NameField.getText());
                    m_model.setPlayer2Name(o_view.player2NameField.getText());
                }
                if(clickSource == o_view.showPlayer2InfoButton) {
                    o_view.player2InfoLabel.setText("" + o_model.getPlayer2Name() + " is ready to play!  Color selection is: "+ o_model.getPlayer2ColorString());
                }
            }
        }
        o_view.addRedButtonListener(new ButtonListener());
        o_view.addOrangeButtonListener(new ButtonListener());
        o_view.addYellowButtonListener(new ButtonListener());
        o_view.addGreenButtonListener(new ButtonListener());
        o_view.addBlueButtonListener(new ButtonListener());
        o_view.addMagentaButtonListener(new ButtonListener());
        o_view.addSavePlayer1InfoButtonListener(new ButtonListener());
        o_view.addShowPlayer1InfoButtonListener(new ButtonListener());
        o_view.addSavePlayer2InfoButtonListener(new ButtonListener());
        o_view.addShowPlayer2InfoButtonListener(new ButtonListener());
    }
    
}
