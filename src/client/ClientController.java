/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

/**
 *
 * @author Frederik
 */
public class ClientController {
    
    private Client client;
    
    public ClientController(){
        
        this.client = new Client();
        
    }
    
    public void connectToServer(){
        this.client.connectToServer();
    }
    
    public String getMessage(){
        String str = this.client.getMessage();
        return str;
        
    }
    
}
