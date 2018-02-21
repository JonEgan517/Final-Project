import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import java.util.ArrayList;

public class Dungeon extends JFrame
	{
	private static final long serialVersionUID = 1L;
	static String name; 
	static int className;
	static int raceName;
	static int choice;
	static JFrame frame = new JFrame();
	static ArrayList <ClassName> character = new ArrayList <ClassName>();

	public static void main(String[] args)
	    {
	    	character.add(new ClassName("warrior", 50, 60));
			character.add(new ClassName("mage", 70, 40));
			character.add(new ClassName("hunter", 30, 80));
	    	
	    name = JOptionPane.showInputDialog("What is your name?");  
		
		JOptionPane.showMessageDialog(frame, "Hello welcome to the Dungeon, " +name+ ".");
		
		Object[] myClass = {"Warrior", "Mage", "Hunter"};
		className = JOptionPane.showOptionDialog(frame, "What class would you like to be?",
				"Your Class",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, myClass, myClass[2]);
		
		switch(className)
			{
			case 0:
				{
				Warrior.warrior();
				break;
				}
			case 1:
				{
				Mage.mage();
				break;	
				}
			case 2:
				{
				Hunter.hunter();
				break;	
				}
			}
	    }				
	}
