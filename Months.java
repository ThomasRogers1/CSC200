import javax.swing.JOptionPane;

public class Months {
	public enum Month {January, February, March, April, May, June, July, August, September, October, November, December}
	public static void main(String [] args) {
		Month[] choices = {Month.January, Month.February, Month.March, Month.April, Month.May, Month.June, Month.July, Month.August, Month.September, Month.October, Month.November, Month.December};
		Month input = (Month) JOptionPane.showInputDialog(null, "Select a month.", "Month", JOptionPane.CANCEL_OPTION, null, choices, choices [0]);

		while (input != null) {
			switch(input) {
			case December:
				JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
				break;
			
			case January:
				JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
				break;

			case February:
				JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
				break;

			case March:
				JOptionPane.showMessageDialog(null, "Happy Spring days!");
				break;

			case April:
				JOptionPane.showMessageDialog(null, "Happy Spring days!");
				break;

			case May:
				JOptionPane.showMessageDialog(null, "Happy Spring days!");
				break;

			case June:
				JOptionPane.showMessageDialog(null, "It's a summer time.");
				break;

			case July:
				JOptionPane.showMessageDialog(null, "It's a summer time.");
				break;

			case August:
				JOptionPane.showMessageDialog(null, "It's a summer time.");
				break;

			case September:
				JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
				break;

			case October:
				JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
				break;

			case November:
				JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
			}
			input = (Month) JOptionPane.showInputDialog(null, "Select a month.", "Months", JOptionPane.INFORMATION_MESSAGE, null, choices, choices [0]);
		}
		JOptionPane.showMessageDialog(null, "Good Bye!");
	}
}
