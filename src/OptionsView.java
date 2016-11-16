
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author jrimland-air
 */
public class OptionsView extends JPanel{
        JTextField player1NameField;
        JTextField player2NameField;
    
        JButton redButton_P1;
        JButton redButton_P2;
        JButton blueButton_P1;
        JButton blueButton_P2;
        JButton greenButton_P1;
        JButton greenButton_P2;
        
        JButton player1Set;
        JButton player2Set;
        
        JLabel player1InfoLabel;
        JLabel player2InfoLabel;
        
        OptionsModel o_model;
        
        OptionsView(OptionsModel o_model)
        {
            this.o_model = o_model;
                          
        }
}
