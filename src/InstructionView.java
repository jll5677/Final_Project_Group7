
import javax.swing.JLabel;
import javax.swing.JPanel;


public class InstructionView extends JPanel{
    InstructionView(){
        JLabel info = new JLabel("The objective of the game is to get to the yellow platform on the other side by moving the square");
        add(info);
        
        JLabel info1 = new JLabel("There will be a timer and the palyer has to get to the otherside in the shortest amount of time possible.");
        add(info1);
        
        JLabel info2 = new JLabel("Player one uses left and right arrow keys to move and up arrow key to jump.");
        add(info2);
        
        JLabel info3 = new JLabel("Player two would use the keys A and D to move and W to jump.");
        add(info3);
    }
}
