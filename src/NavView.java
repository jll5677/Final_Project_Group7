
import java.awt.event.ActionListener;
import javax.swing.JFrame;



public class NavView extends JFrame{
    
    NavModel model;
    NavViewPanel nVpanel;
    
    NavView(NavModel model)
    {
        super("Primary View");
        this.model = model;
                          
        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        nVpanel = new NavViewPanel();
        
        add(nVpanel);    
    }
    
    public void switchToOptionsPanel(OptionsView o_view)
    {
        nVpanel.removeSplash();
        nVpanel.removeMain();
        nVpanel.removeGamePlay();
        nVpanel.removeInstruction();
        nVpanel.removeCredits();
        nVpanel.addOptions(o_view);        
    }
    
    public void switchToMainPanel(MainView m_view)
    {
        nVpanel.removeSplash();
        nVpanel.removeGamePlay();
        nVpanel.removeOptions();
        nVpanel.removeInstruction();
        nVpanel.removeCredits();
        nVpanel.addMain(m_view);        
    }
    
    public void switchToInstructionPanel(InstructionView i_view)
    {
        nVpanel.removeSplash();
        nVpanel.removeMain();
        nVpanel.removeGamePlay();
        nVpanel.removeOptions();
        nVpanel.removeCredits();
        nVpanel.addInstruction(i_view); 
    }
    
    public void switchToCreditsPanel(CreditsView c_view)
    {
        nVpanel.removeSplash();
        nVpanel.removeMain();
        nVpanel.removeGamePlay();
        nVpanel.removeOptions();
        nVpanel.removeInstruction();
        nVpanel.addCredits(c_view); 
    }
    
    public void switchToGamePlayPanel(GamePlay g_play) {
        nVpanel.removeSplash();
        nVpanel.removeMain();
        nVpanel.removeOptions();
        nVpanel.removeInstruction();
        nVpanel.removeCredits();
        nVpanel.addGamePlay(g_play);
    }
    
    public void addOptionsButtonListener(ActionListener al) 
    {    
        nVpanel.menu.optionsButton.addActionListener(al);
    }    
                    
    public void addMainButtonListener(ActionListener al) 
    {    
        nVpanel.menu.mainButton.addActionListener(al);
    }
    
    public void addStartButtonListener(ActionListener al) {
        nVpanel.menu.startButton.addActionListener(al);
    }
    
    public void addInstructionButtonListener(ActionListener al)
    {
        nVpanel.menu.instructionsButton.addActionListener(al);
    }
    
    public void addCreditsButtonListener(ActionListener al)
    {
        nVpanel.menu.creditsButton.addActionListener(al);
    }
    
    
    //TODO: Add listeners to switch to other Panels
    
}
