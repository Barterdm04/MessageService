/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice;

import java.util.Random;

/**
 *
 * @author DB7
 */
public class RandomMessageReader implements MessageReader{
    private String[] messageArray = {"This is message one!","This is message two!", "This is message three!" , "This is message four!"};
    Random RandomGenerator = new Random();
    
    public String readMessage(){      
        return messageArray[RandomGenerator.nextInt(messageArray.length)];
    }
    
}
