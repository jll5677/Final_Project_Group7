
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
                if(clickSource == o_view.redButton_P1) {
                    o_model.setPlayer1Color(Color.RED);
                }
                if(clickSource == o_view.redButton_P2) {
                    o_model.setPlayer1Color(Color.RED);
                }
                if(clickSource == o_view.blueButton_P1) {
                    o_model.setPlayer1Color(Color.BLUE);
                }
                if(clickSource == o_view.blueButton_P2) {
                    o_model.setPlayer1Color(Color.BLUE);
                }
                if(clickSource == o_view.greenButton_P1) {
                    o_model.setPlayer1Color(Color.GREEN);
                }
                if(clickSource == o_view.greenButton_P2) {
                    o_model.setPlayer1Color(Color.GREEN);
                }
            }
        }
    }
    
}
