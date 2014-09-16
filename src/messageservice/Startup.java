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
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //MessageReader reader = new DefaultMessageReader();
        //MessageWriter writer = new ConsoleMessageWriter();
        
        //MessageReader reader = new KeyboardMessageReader();
        //MessageWriter writer = new PromptMessageWriter();
        
        MessageReader reader = new RandomMessageReader();
        MessageWriter writer = new ConsoleMessageWriter();
        
        MessageService messageService = new MessageService(reader, writer);
        messageService.assignMessage();
        
        System.out.println("Program ended successfully.");

    }
    
}
