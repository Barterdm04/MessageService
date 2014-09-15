/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice;

import java.util.Scanner;

/**
 *
 * @author DB7
 */
public class KeyboardMessageReader implements MessageReader {
    @Override
    public String readMessage() {
            System.out.println("Please enter your message, then press return:");

            Scanner input = new Scanner(System.in);
            
            return input.nextLine();
	}
}
