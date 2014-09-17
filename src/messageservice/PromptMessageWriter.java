/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice;

import javax.swing.JOptionPane;

/**
 *
 * @author DB7
 */
public class PromptMessageWriter implements MessageWriter{
    @Override
    public void writeMessage( MessageReader message ) {
        JOptionPane.showMessageDialog(null, message.readMessage() );
    }
}
