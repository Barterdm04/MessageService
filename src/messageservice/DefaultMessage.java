/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice;

/**
 *
 * @author DB7
 */
public class DefaultMessage implements MessageReader{
    public String readMessage(){
        return "This is the default message for the MessageService system.";
    }
}
