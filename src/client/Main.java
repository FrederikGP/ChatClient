package client;
import gui.LogInFrame;

/**
 *
 * @author Frederik
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
       
        
        LogInFrame frame = new LogInFrame();
        frame.setLocation(800, 400);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setTitle("Chatroom v.1");
        
        
        if(frame.getWindowCloser() == false){
           frame.dispose();
        }
   
    }
    
}
