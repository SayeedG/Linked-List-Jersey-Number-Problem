import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * 
 * @author sayeedgulmahamad
 *
 */
public class GUI extends JFrame { //creates GUI and sets the size, location and title
    static TextArea myTextList1 = new TextArea();
	public GUI() {
    setSize(600, 600);
	setLocation(200, 500);
   	setTitle("Project 4");
   	myTextList1.append("Open a text file from your computer to start the program");
   	
   	add(myTextList1);
   	createMenu(); //creates the menu for the GUI
   	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
	}
	
	

	public void createMenu( ) { //Sets the names for the Menu Bar and the Menu Bar Items

		JMenuBar menuBar  = new JMenuBar();
		
		JMenu fileMenu = new JMenu("File");
		JMenu displayMenu = new JMenu("Display");
		
		JMenuItem item;
		
		FileMenuHandler fmh  = new FileMenuHandler(this);
		
		item = new JMenuItem("Open"); 
		item.addActionListener( fmh );
		fileMenu.add( item );
		
		fileMenu.addSeparator(); 
		
		item = new JMenuItem("Quit"); 
		item.addActionListener( fmh );
		fileMenu.add( item );
		
		item = new JMenuItem("All");
		item.addActionListener( fmh );
		displayMenu.add(item);
		
		displayMenu.addSeparator(); //creates the separator between buttons
		
		item = new JMenuItem("Pitchers");
		item.addActionListener( fmh );
		displayMenu.add(item);
		
		displayMenu.addSeparator(); 
		
		item = new JMenuItem("Fielders");
		item.addActionListener( fmh );
		displayMenu.add(item);
		
		setJMenuBar(menuBar);
		menuBar.add(fileMenu);
		menuBar.add(displayMenu);
	} 
}


