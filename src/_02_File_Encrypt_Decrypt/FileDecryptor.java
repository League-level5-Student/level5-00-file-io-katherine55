package _02_File_Encrypt_Decrypt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileDecryptor {
	// Create a program that opens the file created by FileEncryptor and display
	// the decrypted message to the user in a JOptionPane.
	
	public static void main(String[] args) {
		
		String init = null;
		String decrypted;;
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("src/_02_File_Encrypt_Decrypt/test.txt"));
			init = br.readLine();
			br.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		decrypted = "";
		String[] numbers = init.split(" ");
		for (int i = 0; i < numbers.length; i++) {
			int ascii = Integer.parseInt(numbers[i]);
			decrypted += (char) ascii;
		}
		
		JOptionPane.showMessageDialog(null, "Original: " + init + "\nDecrypted: " + decrypted);
		
	}
	
}
