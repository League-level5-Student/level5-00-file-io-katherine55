package _03_To_Do_List;

import java.util.ArrayList;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;

public class ToDoList implements MouseListener{
	
	JFrame myFrame = new JFrame();
	JPanel myPanel = new JPanel();
	JButton addB = new JButton("Add Task");
	JButton viewB = new JButton("View Tasks");
	JButton removeB = new JButton("Remove Task");
	JButton saveB = new JButton("Save List");
	JButton loadB = new JButton("Load List");
	
	ArrayList<String> tasks = new ArrayList<>();
	
	/*
	 * Create a program with five buttons, add task, view tasks, remove task, save list, and load list. 
	 * 
	 * When add task is clicked:
	 * 		ask the user for a  task and save it to an array list
	 * 
	 * When the view tasks button is clicked:
	 *		show all the tasks in the list
	 * 
	 * When the remove task button is clicked:
	 * 		prompt the user for which task to remove and take it off of the list.
	 * 
	 * When the save list button is clicked:
	 * 		Save the list to a file
	 * 
	 * When the load list button is clicked:
	 * 		Prompt the user for the location of the file and load the list from that file
	 * 
	 * When the program starts, it should automatically load the last saved file into the list.
	 */
	
	public static void main(String[] args) {
		ToDoList joeseph = new ToDoList();
		joeseph.gui();
	}
	
	
	void gui() {
		addB.addMouseListener(this);
		viewB.addMouseListener(this);
		removeB.addMouseListener(this);
		saveB.addMouseListener(this);
		loadB.addMouseListener(this);
		
		myFrame.add(myPanel);
		myPanel.add(addB);
		myPanel.add(viewB);
		myPanel.add(removeB);
		myPanel.add(saveB);
		myPanel.add(loadB);
		
		myFrame.setVisible(true);
		myFrame.pack();
		
	}
	
	void add() {
		String task = JOptionPane.showInputDialog("Add a task");
		tasks.add(task);
	}
	
	void view() {
		for(int i = 0; i < tasks.size(); i++) {
			JLabel x = new JLabel(tasks.get(i));
			myPanel.add(x);
		}	
		myFrame.pack();
	}
	
	void remove() {
		String removal = JOptionPane.showInputDialog("Remove a task");
		for(int i = 0; i < tasks.size(); i++) {
			if(tasks.get(i).equalsIgnoreCase(removal)) {
				tasks.remove(i);
			}
		}
	}
	
	void save() {
		try {
			FileWriter fw = new FileWriter("src/_03_To_Do_List/list.txt");
			for(int i = 0; i < tasks.size(); i++) {
				fw.write(tasks.get(i) + "\n");
			}	
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	void load() {

		try {
			String fileName = "";
			JFileChooser jfc = new JFileChooser();
			int returnVal = jfc.showOpenDialog(null);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				fileName = jfc.getSelectedFile().getAbsolutePath();
			}
			
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			
			String line = br.readLine();
			while(line != null){
				tasks.add(line);
				line = br.readLine();
			}
			
			br.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}


	@Override
	public void mouseClicked(MouseEvent e) {

	}


	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getSource().equals(addB)) {
			add();
		}
		else if(e.getSource().equals(viewB)) {
			view();
		}
		else if(e.getSource().equals(removeB)) {
			remove();
		}
		else if(e.getSource().equals(saveB)) {
			save();
		}
		else if(e.getSource().equals(loadB)) {
			load();
		}
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
