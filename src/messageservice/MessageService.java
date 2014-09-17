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
public class MessageService {

	private MessageReader reader;
	private MessageWriter writer;
	
	public MessageService( MessageReader reader, MessageWriter writer ) {
            this.reader = reader;
            this.writer = writer;
//            assignMessage();
	}
	
	public void assignMessage() {
            writer.writeMessage( reader );
	}
}
