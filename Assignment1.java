import javax.swing.JOptionPane;

public class Assignment1 {
	public static void main(String [] args) {
		String degrees = JOptionPane.showInputDialog(null, "Enter a temperature in degrees Fahrenheit:"); // prompting user to input a degree from the fahrenheit scale
		int degreesF = Integer.parseInt(degrees); // convert the string into an int
		int degreesC = 5*(degreesF-32)/9; // conversion of fahrenheit to celsius
		JOptionPane.showMessageDialog(null, degreesF + " degrees Fahrenheit is " + degreesC + " degrees Celsius."); // message after the degree is converted
	}
}
