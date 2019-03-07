package examples;

import javax.swing.JOptionPane;

public class Dateable {
	public static void main(String[] args) {

		/* Apparently it's OK to date younger guys once they're at least half your age plus seven. */

		int myAge = 40;
		int hisAge = 21;

		int youngestAgeHeCanBe = myAge / 2 + 7;
		int oldestHeCanBe = 55;

		if (youngestAgeHeCanBe < hisAge) {
			if (oldestHeCanBe > hisAge) {
				JOptionPane.showMessageDialog(null, "\u2665 Go for it! \u2665");
			} else {
				JOptionPane.showMessageDialog(null, "I know you're no spring chicken yourself, but " + hisAge + " is too old.");
			}
		} else {
			JOptionPane.showMessageDialog(null, hisAge + " is too young, Cradlesnatcher!");
		}

	}
}
