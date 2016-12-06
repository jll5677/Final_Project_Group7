import java.awt.Dimension;
import javax.swing.JFrame;


public class Window extends JFrame{
    public Window(int w, int h, String title, Game game)
    {
        game.setPreferredSize(new Dimension(w, h));
        game.setMaximumSize(new Dimension(w, h));
        game.setMinimumSize(new Dimension(w, h));
        
        add(game);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        
        game.start();
    }
}
