package guiTutorial;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.MenuItem;

import javax.swing.*;

/**
 * An application which has menu bar in it.
 * @author Akhil K Anil
 *
 */
public class MenuFrame {
	public static void main(String[] args) {
		// Creating the Frame.
		JFrame frame = new JFrame("My First GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);

		// Creating the Menu Bar.
		JMenuBar menuBar = new JMenuBar();
		JMenu menu1 = new JMenu("File");
		JMenu menu2 = new JMenu("Edit");
		menuBar.add(menu1);
		menuBar.add(menu2);

		//Creating menu item for the menu
		JMenuItem menuItem1 = new JMenuItem("Open");
		JMenu menuItem2 = new JMenu("Save");
		JMenuItem menuItem2_1 = new JMenuItem("Save As");
		menu1.add(menuItem1);
		menu1.add(menuItem2);
		//Adding a sub menu.
		menuItem2.add(menuItem2_1);

		JMenuItem menuItem3 = new JMenuItem("Undo");
		JMenuItem menuItem4 = new JMenuItem("Copy");
		menu2.add(menuItem3);
		menu2.add(menuItem4);
		
		JPanel dummyPanel = new JPanel();
	

		// Creating a Panel.
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Enter text: ");
		JTextArea textArea = new JTextArea(1, 15);
		JButton sendButton = new JButton("send");
		JButton resetButton = new JButton("reset");
		panel.add(dummyPanel);
		panel.add(label);
		panel.add(textArea);
		panel.add(sendButton);
		panel.add(resetButton);

		frame.getContentPane().add(BorderLayout.NORTH, menuBar);
		frame.getContentPane().add(BorderLayout.CENTER, panel);
		frame.setVisible(true);
	}
}
