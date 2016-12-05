
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;


public class OptionsView extends JPanel{
        JButton redButton;
        JButton greenButton;
        JButton blueButton;
        JSlider playerSizeSlider;
        JLabel playerInfoLabel;
        JButton savePlayerInfoButton;
        JButton showPlayerInfoButton;
        
        OptionsModel o_model;
        
        OptionsView(OptionsModel o_model)
        {
            this.o_model = o_model;
            
            redButton = new JButton("Red");
            greenButton = new JButton("Green");
            blueButton = new JButton("Blue");
            
            playerSizeSlider = new JSlider(JSlider.HORIZONTAL, 32, 47, 5);
            playerSizeSlider.setMajorTickSpacing(5);
            playerSizeSlider.setPaintTicks(true);
            playerSizeSlider.setPaintLabels(true);
            
            savePlayerInfoButton = new JButton("Save Info");
            showPlayerInfoButton = new JButton("Show Info");
            playerInfoLabel = new JLabel("No Info Yet");
            
            GridLayout grid = new GridLayout(8,2);
            setLayout(grid);
            
            add(redButton);
            add(greenButton);
            add(blueButton);
            add(playerSizeSlider);
            add(savePlayerInfoButton);
            add(showPlayerInfoButton);
            add(playerInfoLabel);
        }
        
        public void addRedButtonListener(ActionListener alR) {
            redButton.addActionListener(alR);
        }
        public void addGreenButtonListener(ActionListener alG) {
            greenButton.addActionListener(alG);
        }
        public void addBlueButtonListener(ActionListener alB) {
            blueButton.addActionListener(alB);
        }
        public void addSavePlayerInfoButtonListener(ActionListener alSave) {
            savePlayerInfoButton.addActionListener(alSave);
        }
        public void addShowPlayerInfoButtonListener(ActionListener alShow) {
            showPlayerInfoButton.addActionListener(alShow);
        }
}
