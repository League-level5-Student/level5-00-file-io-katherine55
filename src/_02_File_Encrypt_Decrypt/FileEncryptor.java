package _02_File_Encrypt_Decrypt;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileEncryptor {
	// Create a program that takes a message from the user.
	// Use the methods in the String and Character classes to save
	// an encrypted form of the message to a file

	public static void main(String[] args) {

		String initMessage = JOptionPane.showInputDialog("Write a message to be encrypted!");
		String encryptedMessage = "";

		for (int i = 0; i < initMessage.length(); i++) {
			Character a = initMessage.charAt(i);
			int ascii = (int) a;
			encryptedMessage += ascii + " ";
		}

		try {
			FileWriter fw = new FileWriter("src/_02_File_Encrypt_Decrypt/test.txt");
			fw.write(encryptedMessage);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
