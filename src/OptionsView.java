
import java.awt.GridLayout;
import java.awt.event.ActionListener;
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
        
        JLabel player1InfoLabel;
        JLabel player2InfoLabel;
        
        JButton updatePlayer1InfoButton;
        JButton updatePlayer2InfoButton;
        
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
            player1InfoLabel = new JLabel("No Info Yet");
            player2InfoLabel = new JLabel("No Info Yet");
            updatePlayer1InfoButton = new JButton("Update Player 1 Info");
            updatePlayer2InfoButton = new JButton("Update Player 2 Info");
            
            GridLayout grid = new GridLayout(6,2);
            setLayout(grid);
            
            add(player1NameField);
            add(player2NameField);
            add(redButton_P1);
            add(redButton_P2);
            add(blueButton_P1);
            add(blueButton_P2);
            add(greenButton_P1);
            add(greenButton_P2);
            add(updatePlayer1InfoButton);
            add(updatePlayer2InfoButton);
            add(player1InfoLabel);
            add(player2InfoLabel);
        }
        
        public void addP1RedButtonListener(ActionListener alR1) {
            redButton_P1.addActionListener(alR1);
        }
        public void addP2RedButtonListener(ActionListener alR2) {
            redButton_P2.addActionListener(alR2);
        }
        public void addP1BlueButtonListener(ActionListener alB1) {
            blueButton_P1.addActionListener(alB1);
        }
        public void addP2BlueButtonListener(ActionListener alB2) {
            blueButton_P2.addActionListener(alB2);
        }
        public void addP1GreenButtonListener(ActionListener alG1) {
            greenButton_P1.addActionListener(alG1);
        }
        public void addP2GreenButtonListener(ActionListener alG2) {
            greenButton_P2.addActionListener(alG2);
        }
        public void addUpdatePlayer1InfoButtonButtonListener(ActionListener alP1Info) {
            updatePlayer1InfoButton.addActionListener(alP1Info);
        }
        public void addUpdatePlayer2InfoButtonButtonListener(ActionListener alP2Info) {
            updatePlayer2InfoButton.addActionListener(alP2Info);
        }
}
