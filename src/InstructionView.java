
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jll5677
 */
public class InstructionView extends JPanel{
    InstructionView(){
        JTextField info = new JTextField("To move the character(box) player one uses left");
        add(info);
    }
}
