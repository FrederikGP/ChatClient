package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author Frederik
 */
public class Client {
    
    private String username;
    private Message message;
    private byte isAlive;
    private int portNumber;
    private Socket client;
    private DataInputStream dis;
    private DataOutputStream dos;
    private String line;
   
    
    
    
    //Constructor.
    public Client(){
        this.username = "";
        this.isAlive = 0;
        this.portNumber = 8189;
        
        //jeg giver kage.
        
    }
    
    
    //Set methods.
    public void setUsername(String str){this.username = str;}
    
    
    public void sendMessage(String str){
        
        this.message = new Message();
        this.message.writeMessage(str);
    }
    
    
    
    public void connectToServer(){
        try{
        this.client = new Socket("127.0.0.1", this.portNumber);
        dis = new DataInputStream(client.getInputStream());
        dos = new DataOutputStream(client.getOutputStream());
        
        this.line = dis.readLine();
       // this.dos.writeBytes("Dav"+"\n");
        client.close();
        
            System.out.println("worked");
        
        
        }catch(IOException ex){
            System.out.println("didnt work");
            
        }
        
        
    }
    
    public String getMessage(){
        return this.line;
    }
    
    
    
    
    
    
    
    
    public void isAlive(){
        
    }
    
}
