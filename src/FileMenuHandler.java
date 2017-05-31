import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.StringTokenizer;
/**
 * 
 * @author sayeedgulmahamad
 *
 */
public class FileMenuHandler implements ActionListener { //creates GUI and calls on the different LinkedLists
	GUI jframe;
	String OpenedFile = null;
	LinkedList aList = new LinkedList();
	LinkedList bList = new LinkedList();
	LinkedList cList = new LinkedList();

   public FileMenuHandler (GUI jf) {
	   jframe = jf;

   }
   public void actionPerformed(ActionEvent event) { //Creates a Menu Item called "Open" for the the Menu Bar
	   String  menuName;
	   menuName = event.getActionCommand();
	   if (menuName.equals("Open")){
		   openFile( ); 
		   System.out.println(OpenedFile);
		   jframe.setTitle("All"); //If clicked on the Menu Item "All" the specified linked list will appear
		   jframe.setSize(600, 600);
		   Display(cList);
	   }

	   else if (menuName.equals("Quit"))
		   System.exit(0); //If clicked on the Menu Item "Quit", the program will close
	   else if (menuName.equals("All"))
	   {
		   jframe.setTitle("All");
		   Display(cList);
	   }
	   else if (menuName.equals("Pitchers")){ //If clicked on the Menu Item "Pitchers", the specified linked list will appear
		   jframe.setTitle("Pitchers");
		   Display(aList);
	   }

	   else if (menuName.equals("Fielders")){ //If clicked on the Menu Item "Fielders", the specified linked list will appear
		   jframe.setTitle("Fielders");
		   Display(bList);
	   }

   }

    private void openFile( ) { //no argument constructor to allow the user to open a file from their computer
       JFileChooser chooser;
       int          status;
       chooser = new JFileChooser( );
       status = chooser.showOpenDialog(null);
       if (status == JFileChooser.APPROVE_OPTION) {
          this.OpenedFile = chooser.getSelectedFile().getAbsolutePath();
            
      	TextFileInput input = new TextFileInput(OpenedFile);
      	
		String line;
      	while((line = input.readLine()) != null)
      	{
      	   try{
    		StringTokenizer myTokens = new StringTokenizer(line,","); //Tokenizes the lines and delimits by a comma
    		char token = myTokens.nextToken().charAt(0);
    		if(token=='P'){ //If the token has a "P" append the specified linked list 
    			int number =Integer.parseInt(myTokens.nextToken());
    			String last = myTokens.nextToken();
    			String first = myTokens.nextToken();
    			float batavg = Float.parseFloat(myTokens.nextToken());
    			float ERA = Float.parseFloat(myTokens.nextToken());
    			Pitcher temp = new Pitcher(number, last,first,batavg,ERA);
    			cList.append(temp);
    			aList.append(temp);
    		}
    		else if(token =='F'){ //If the token has a "F" append the specified linked list 
    			int number =Integer.parseInt(myTokens.nextToken());
    			String last = myTokens.nextToken();
    			String first = myTokens.nextToken();
    			float batavg = Float.parseFloat(myTokens.nextToken());
    			Fielder temp = new Fielder(number, last, first, batavg);
    			cList.append(temp);
    			bList.append(temp);
    		}
      	   }
    		catch (Exception e) {
               System.out.println("An Exception happened, wrong input");
            }
        }

      	}
    	  
       
       else 
          JOptionPane.showMessageDialog(null, "The Open File dialog has been canceled");
    }
  
    private void Display (LinkedList list) { // method to display the specified LinkedList
    	Container myContentPane = jframe.getContentPane();
    	LinkedListIterator lli = list.reset();
    	GUI.myTextList1.setText(null);
    	while (lli.hasNext())
    		GUI.myTextList1.append(lli.next().getEverything()+"\n");
    	myContentPane.add(GUI.myTextList1);

    	jframe.setVisible(true);  
    }    
}