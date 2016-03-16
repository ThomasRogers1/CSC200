import javax.swing.JOptionPane;

public class TemperatureConversion {
	public static void main(String [] args) {
		String Degrees = JOptionPane.showInputDialog(null, "Enter a temperature in degrees Fahrenheit:");
		int DegreesF = Integer.parseInt(Degrees);
		double DegreesC = 5 * (DegreesF - 32) / 9;
		JOptionPane.showMessageDialog(null, DegreesF + " degrees Fahrenheit is " + DegreesC + " degrees Celsius.");
	}
}
