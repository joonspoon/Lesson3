package examples;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
	public static void main(String[] args) {
		
		JOptionPane.showInputDialog("Ask the Magic 8 Ball a yes or no question:");
		
		int randomNumber = new Random().nextInt(2);
		
		if(randomNumber == 0) {
			JOptionPane.showMessageDialog(null, "Certainly!");
		}
		if (randomNumber == 1) {
			JOptionPane.showMessageDialog(null, "Hell no!");
		}
		if (randomNumber == 2) {
			JOptionPane.showMessageDialog(null, "Hell no!");
		}
		if (randomNumber == 3) {
			JOptionPane.showMessageDialog(null, "Hell no!");
		}
		
	}

}
