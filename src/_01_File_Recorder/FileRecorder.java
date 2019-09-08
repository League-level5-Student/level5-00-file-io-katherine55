package _01_File_Recorder;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileRecorder {
	public static void main(String[] args) {

		String message = JOptionPane.showInputDialog("Type a message!");
		
		// Create a program that takes a message from the user and saves it to a file.
		try {
			FileWriter fw = new FileWriter("src/_01_File_Recorder/test.txt");
			fw.write(message);

			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
