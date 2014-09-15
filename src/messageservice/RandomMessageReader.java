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
    
    @Override
    public String readMessage(){    
        String[] messageArray = {"This is message one!","This is message two!", "This is message three!" , "This is message four!", "This is message five!", "This is message six!"};
        Random RandomGenerator = new Random();
        return messageArray[RandomGenerator.nextInt(messageArray.length)];
    }
    
}
