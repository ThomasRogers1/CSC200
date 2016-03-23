import javax.swing.JOptionPane;

public class BooleanExpressions {
	public static void main(String [] args) {
		String people = JOptionPane.showInputDialog("Enter Number of People");
		String players = JOptionPane.showInputDialog("Enter Number of Players");

		int numPeople = Integer.parseInt(people);
		int groupSize = numPeople / 2;
		int groupSize2 = numPeople / 3;

		int numPlayers = Integer.parseInt(players);
		int teamSize = numPlayers / 11;
		int teamSize2 = 1;

		if (numPeople>10) {
			if (numPlayers<=55 && numPlayers>=11) {
				JOptionPane.showMessageDialog(null,"Number of people = " + people + "\n" + "groupSize = " + groupSize 
								+ "\n" + "Number of players = " + players + "\n" + "teamSize = " + teamSize);
			} else {
				JOptionPane.showMessageDialog(null,"Number of people = " + people + "\n" + "groupSize = " + groupSize 
								+ "\n" + "Number of players = " + players + "\n" + "teamSize = " + teamSize2);
			}
		}
		else if (numPeople<=10 && numPeople>=3) {
			if (numPlayers<=55 && numPlayers>=11) {
				JOptionPane.showMessageDialog(null,"Number of people = " + people + "\n" + "groupSize = " + groupSize2
								+ "\n" + "Number of players = " + players + "\n" + "teamSize = " + teamSize);
			} else {
				JOptionPane.showMessageDialog(null,"Number of people = " + people + "\n" + "groupSize = " + groupSize2
								+ "\n" + "Number of players = " + players + "\n" + "teamSize = " + teamSize2);
			}
		}
		else {
			if (numPlayers<=55 && numPlayers>=11) {
				JOptionPane.showMessageDialog(null,"Number of people = " + people + "\n" + "The number of people has to be at least 3."
								+ "\n" + "Number of players = " + players + "\n" + "teamSize = "+ teamSize);
			} else {
				JOptionPane.showMessageDialog(null,"Number of people = " + people + "\n" + "The number of people has to be at least 3."
								+ "\n" + "Number of players = " + players + "\n" + "teamSize = " + teamSize2);
			}
		}
	}
}
