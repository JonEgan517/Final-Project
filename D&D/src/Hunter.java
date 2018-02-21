import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Hunter
	{
		static JFrame frame = new JFrame();
		static String direction;
		static int dragon;
		static int chest;
		
		public static void hunter()
			{
				direction = JOptionPane.showInputDialog("You enter the dungeon as a "+Dungeon.character.get(2).getName()
						+", and the hallway goes two directions. Which way do you go, left or right?");
						
						if (direction.equals("Left") || direction.equals("left"))
							{
							JOptionPane.showMessageDialog(frame, "That is the right way so move forward.");
							
							int health = (int)(Math.random()*100)+1;
							int strength = (int)(Math.random()*100)+1;
							
							Object[] options = {"Fight"};
							dragon = JOptionPane.showOptionDialog(frame, "You see a giant dragon who has " +health+ " hp and can deal " +strength+ " damage.",
									"Ready",
									JOptionPane.YES_NO_CANCEL_OPTION,
									JOptionPane.QUESTION_MESSAGE,
									null, options, options[0]);
							
							int sum = 0;
							int add = 0;
								
							sum = Dungeon.character.get(2).getHp() + Dungeon.character.get(2).getAttack();
							add = health + strength;
								
								if(add < sum)
								{
								JOptionPane.showMessageDialog(frame, "You defeated the Dragon. You won because you had more health and more strength. Health = " 
								+ Dungeon.character.get(1).getHp() + " Strength = " + Dungeon.character.get(1).getAttack());
								
								Object[] loot = {"Loot Chest"};
								chest = JOptionPane.showOptionDialog(frame, "You see a chest that is below the dragon.",
										"Open",
										JOptionPane.YES_NO_CANCEL_OPTION,
										JOptionPane.QUESTION_MESSAGE,
										null, loot, loot[0]);
								
								JOptionPane.showMessageDialog(frame, "You found a magical bow and arrow which gives you more attack damage. "
								+ "You also saved the kingdom as a " +Dungeon.character.get(2).getName()+ ".");
								}
											
								else if(add > sum)
								{
								JOptionPane.showMessageDialog(frame, "You were kill by the dragon, so you die.");	
								}
							}
						
						else if (direction.equals("Right") || direction.equals("right"))
							{
							JOptionPane.showMessageDialog(frame, "You chose the wrong way, so you die.");
							}
			}
	}