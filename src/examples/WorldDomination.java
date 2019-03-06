package examples;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {

		String answer = JOptionPane.showInputDialog("Do you know Java?");

		if (answer.equals("yes")) {
			JOptionPane.showMessageDialog(null, "You will rule the world!");
		} else {
			JOptionPane.showMessageDialog(null, "Good luck washing dishes!");
		}

	}
}
