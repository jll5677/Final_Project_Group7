
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jrimland-air
 */
public class OptionsController {
    
    OptionsModel o_model;
    OptionsView o_view;
    
    OptionsController(final OptionsModel o_model, final OptionsView o_view)
    {
        this.o_model = o_model;
        this.o_view = o_view;
        
        class ButtonListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                JButton clickSource = (JButton)e.getSource();
                if(clickSource == o_view.redButton) {
                    o_model.setPlayer1Color(Color.RED);
                }
                if(clickSource == o_view.orangeButton) {
                    o_model.setPlayer2Color(Color.ORANGE);
                }
                if(clickSource == o_view.yellowButton) {
                    o_model.setPlayer1Color(Color.YELLOW);
                }
                if(clickSource == o_view.greenButton) {
                    o_model.setPlayer2Color(Color.GREEN);
                }
                if(clickSource == o_view.blueButton) {
                    o_model.setPlayer1Color(Color.BLUE);
                }
                if(clickSource == o_view.magentaButton) {
                    o_model.setPlayer2Color(Color.MAGENTA);
                }
                if(clickSource == o_view.updatePlayer1InfoButton) {
                    o_model.setPlayer1Name(o_view.player1NameField.getText());
                    o_view.player1InfoLabel.setText("" + o_model.getPlayer1Name() + " is ready to play!  Color selection is: " + o_model.getPlayer1ColorString());
                }
                if(clickSource == o_view.updatePlayer2InfoButton) {
                    o_model.setPlayer2Name(o_view.player2NameField.getText());
                    o_view.player2InfoLabel.setText("" + o_model.getPlayer2Name() + " is ready to play!  Color selection is: "+ o_model.getPlayer2ColorString());
                }
            }
        }
        o_view.addP1RedButtonListener(new ButtonListener());
        o_view.addP2RedButtonListener(new ButtonListener());
        o_view.addP1BlueButtonListener(new ButtonListener());
        o_view.addP2BlueButtonListener(new ButtonListener());
        o_view.addP1GreenButtonListener(new ButtonListener());
        o_view.addP2GreenButtonListener(new ButtonListener());
        o_view.addUpdatePlayer1InfoButtonButtonListener(new ButtonListener());
        o_view.addUpdatePlayer2InfoButtonButtonListener(new ButtonListener());
    }
    
}
