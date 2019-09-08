package _03_To_Do_List;

import java.util.ArrayList;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
		addB.addMouseListener(null);
		viewB.addMouseListener(null);
		removeB.addMouseListener(null);
		saveB.addMouseListener(null);
		loadB.addMouseListener(null);
		
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
	}
	
	void remove() {}
	
	void save() {}
	
	void load() {}


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
