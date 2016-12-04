


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NavController {
    
    NavModel n_model;
    NavView n_view;

    OptionsModel o_model;
    OptionsView o_view;
    OptionsController o_controller;  
           
    MainModel m_model;
    MainView m_view;
    MainController m_controller;
    InstructionView i_view;
    CreditsView c_view;
    Game s_game;
    GamePlay g_play;
    
    public NavController(NavModel n_model, NavView n_view ) {
        this.n_model = n_model;
        this.n_view = n_view;
        
        m_model = new MainModel();
        m_view = new MainView(m_model);
        m_controller = new MainController(m_model, m_view);
        
        g_play = new GamePlay();
        
        o_model = new OptionsModel();        
        o_view = new OptionsView(o_model);
        o_controller = new OptionsController(o_model, o_view, m_model, g_play);
        
        i_view = new InstructionView();
        s_game = new Game();
        c_view = new CreditsView();
                
        n_view.addOptionsButtonListener(new OptionsButtonListener());
        n_view.addMainButtonListener(new MainButtonListener()); 
        n_view.addInstructionButtonListener(new InstructionButtonListener());
        n_view.addCreditsButtonListener(new CreditsButtonListener());
        n_view.addstartButtonListener(new StartButtonListener());
        
    }
    class OptionsButtonListener implements ActionListener {            
        public void actionPerformed(ActionEvent e)
        {            
            
            n_view.switchToOptionsPanel(o_view);
        }
    }     
 
    class MainButtonListener implements ActionListener {            
        public void actionPerformed(ActionEvent e)
        {            
            
            n_view.switchToMainPanel(m_view);
        }
    }
    
    class InstructionButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e)
        {
            n_view.switchToInstructionPanel(i_view);
        }         
    }
    class CreditsButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e)
        {
            n_view.switchToCreditsPanel(c_view);
        }
    }
    class StartButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e)
        {
            n_view.switchToStartGamePanel(s_game);
        }
    }
}
    
    
   
