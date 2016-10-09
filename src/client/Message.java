package client;

/**
 *
 * @author Frederik
 */
public class Message {
        
    private String message;
    private String sender;
    
    
    public Message(){
        
        this.message = "";
        this.sender = "";
    }
    
    
    public void writeMessage(String str){this.message = str;}
    
    public String getMessage(){return this.message;}
    
}
