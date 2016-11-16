
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
            
            player1NameField = new JTextField("Enter Player 1 Name");
            player2NameField = new JTextField("Enter Player 2 Name");
            redButton_P1 = new JButton("Red");
            redButton_P2 = new JButton("Red");
            blueButton_P1 = new JButton("Blue");
            blueButton_P2 = new JButton("Blue");
            greenButton_P1 = new JButton("Green");
            greenButton_P2 = new JButton("Green");
            player1Set = new JButton("Set Player 1 Info");
            player2Set = new JButton("Set Player 2 Info");
            player1InfoLabel = new JLabel("No Info Yet");
            player2InfoLabel = new JLabel("No Info Yet");
            
            add(player1NameField);
            add(redButton_P1);
            add(blueButton_P1);
            add(greenButton_P1);
            add(player1Set);
            add(player1InfoLabel);
        }
}
