package ui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ToDoListApp extends JFrame{

	JTextField taskField;
	DefaultListModel<String>taskListModel;
	JList<String>taskList;
	JButton addButton,deleteButton;
	
	public ToDoListApp() {
	setTitle("To-Do List");
	setSize(400, 300);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(new BorderLayout());
	
	taskField = new JTextField();
	add(taskField,BorderLayout.NORTH);
	
	taskListModel = new DefaultListModel<>();
	taskList=new  JList<>(taskListModel);
	add(new JScrollPane(taskList),BorderLayout.CENTER);
	
	JPanel buttonPanel=new JPanel();
	addButton = new JButton("Add task");
	deleteButton=new JButton("Delete Button");
	buttonPanel.add(addButton);
	buttonPanel.add(deleteButton);
	add(buttonPanel,BorderLayout.SOUTH);
	
	addButton.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			addtask();
			
		}
	});
	
	deleteButton.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			deleteTask();
			
		}
	});
	}
	private void addtask() {
		String task=taskField.getText().trim();
		if (!task.isEmpty()) {
			taskListModel.addElement(task);
			taskField.setText("");
		}else {
			JOptionPane.showMessageDialog(this, "Task cannot be empty!","Error",JOptionPane.ERROR_MESSAGE);
		}

	}
	private void deleteTask() {
		int selectedIndex=taskList.getSelectedIndex();
		if (selectedIndex!=-1) {
			taskListModel.remove(selectedIndex);
		}else {
			JOptionPane.showMessageDialog(this,"Please select a task to delete","Error",JOptionPane.ERROR_MESSAGE);
		}

	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(()->{
			new ToDoListApp().setVisible(true);
		});
	}
}
