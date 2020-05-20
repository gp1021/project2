package riddlersLabyrinth;

import javax.swing.*;

public class WindowLabyrinth {
	
	
	public void msg(ImageIcon icon) {
		JOptionPane.showMessageDialog(null, icon); //sends an image message to the user
	}
	
	public String in(String msg) {
		return JOptionPane.showInputDialog(msg); //asks the user to input a response
	}
	
	public void println(String msg) {
		System.out.println(msg); //prints a message
	}
	
	//shows the selected buttons as well as the labyrinth
	public int option1(String[] options, String map) {
		return JOptionPane.showOptionDialog(null, map, "Select your direction.", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
	}
	
	public void msg1(String s) {
		JOptionPane.showMessageDialog(null, s); //shows the user a jpane message
		
	}

	public void msg2(String[][] strings) {
		JOptionPane.showMessageDialog(null, strings); //shows a jpane message in the form of a 2d string
		
	}


}
