
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jll5677
 */
public class CreditsView extends JPanel{

    JLabel credit1;
    JLabel credit2;
    JLabel credit3;
    
    CreditsView()
    {
    GridLayout grid = new GridLayout(1,3);
    setLayout(grid);
        
    credit1 = new JLabel("Cody Farrell");
    credit2 = new JLabel("Jian Li");
    credit3 = new JLabel("Daniel Backer");
    
    add(credit1);
    add(credit2);
    add(credit3);
    }

    
    

    
}
