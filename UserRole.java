import javax.swing.JOptionPane;

public class UserRole {
	public static void main(String [] args) {
		String Role;
		Role = JOptionPane.showInputDialog("Enter Role" + "\n" + "(Administrator, Faculty, Staff, Student, Guest)");

		switch(Role) {
		case "Administrator":
			JOptionPane.showMessageDialog(null, "Welcome Administrator!");
			break;

		case "Faculty":
			JOptionPane.showMessageDialog(null, "Welcome Faculty!");
			break;

		case "Staff":
			JOptionPane.showMessageDialog(null, "Welcome Staff!");
			break;
	
		case "Student":
			JOptionPane.showMessageDialog(null, "Welcome Student!");
			break;

		case "Guest":
			JOptionPane.showMessageDialog(null, "Welcome Guest!");
			break;

		default:
			JOptionPane.showMessageDialog(null, "Your role is incorrect!");
		}
	}
}
