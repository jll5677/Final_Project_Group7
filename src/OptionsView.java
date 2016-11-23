
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
    
        JButton redButton;
        JButton orangeButton;
        JButton yellowButton;
        JButton greenButton;
        JButton blueButton;
        JButton magentaButton;
        
        JLabel player1InfoLabel;
        JLabel player2InfoLabel;
        
        JButton showPlayer1InfoButton;
        JButton showPlayer2InfoButton;
        
        OptionsModel o_model;
        
        OptionsView(OptionsModel o_model)
        {
            this.o_model = o_model;
            
            player1NameField = new JTextField("Enter Player 1 Name");
            player2NameField = new JTextField("Enter Player 2 Name");
            redButton = new JButton("Red");
            orangeButton = new JButton("Orange");
            yellowButton = new JButton("Yellow");
            greenButton = new JButton("Green");
            blueButton = new JButton("Blue");
            magentaButton = new JButton("Magenta");
            
            player1InfoLabel = new JLabel("No Info Yet");
            player2InfoLabel = new JLabel("No Info Yet");
            showPlayer1InfoButton = new JButton("Show Player 1 Info");
            showPlayer2InfoButton = new JButton("Show Player 2 Info");
            
            GridLayout grid = new GridLayout(6,2);
            setLayout(grid);
            
            add(player1NameField);
            add(player2NameField);
            add(redButton);
            add(orangeButton);
            add(yellowButton);
            add(greenButton);
            add(blueButton);
            add(magentaButton);
            add(showPlayer1InfoButton);
            add(showPlayer2InfoButton);
            add(player1InfoLabel);
            add(player2InfoLabel);
        }
        
        public void addRedButtonListener(ActionListener alR) {
            redButton.addActionListener(alR);
        }
        public void addOrangeButtonListener(ActionListener alO) {
            orangeButton.addActionListener(alO);
        }
        public void addYellowButtonListener(ActionListener alY) {
            yellowButton.addActionListener(alY);
        }
        public void addGreenButtonListener(ActionListener alG) {
            greenButton.addActionListener(alG);
        }
        public void addBlueButtonListener(ActionListener alB) {
            blueButton.addActionListener(alB);
        }
        public void addMagentaButtonListener(ActionListener alM) {
            magentaButton.addActionListener(alM);
        }
        public void addShowPlayer1InfoButtonButtonListener(ActionListener alP1Info) {
            showPlayer1InfoButton.addActionListener(alP1Info);
        }
        public void addShowPlayer2InfoButtonButtonListener(ActionListener alP2Info) {
            showPlayer2InfoButton.addActionListener(alP2Info);
        }
}
