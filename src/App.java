


public class App {
    public static void main(String[] args) {
        
        NavModel model = new NavModel();
        NavView view = new NavView(model);
        NavController controller = new NavController(model, view);
        
        view.setSize(700,700);
        
        view.setVisible(true);
        
    }
}


