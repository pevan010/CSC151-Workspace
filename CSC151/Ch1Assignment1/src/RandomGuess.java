//Preston Evans, 1/15/24, When running the program, the user is asked to think of a number 1-10 before clicking okay.
//After clicking okay, a number from 1-10 is shown. 
import javax.swing.JOptionPane;

public class RandomGuess {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"Think of a number 1-10, click okay to see what the number is");
		JOptionPane.showMessageDialog(null,"The number is "+
				(1 + (int)(Math.random() * 10)));
		

	}

}