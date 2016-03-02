import javax.swing.JOptionPane; // importing JOptionPane to code

/**
* Author: Thomas Rogers
* Email: trogers5144@gmai.com
* Date: March 2, 2016
* Description: This is a java code to give the user entry to computer as long as they know the username and password for the computer.
*/

public class UsersLogin {
	public static void main(String [] args) {
		String Username, Password; // declaring string names
					
		Username = JOptionPane.showInputDialog("Enter Username"); // prompt user to enter a username
		Password = JOptionPane.showInputDialog("Enter Password"); // prompt user to enter a password
											
		if (Username.equals("Thomas") && Password.equals("Rogers")) { // stating that Username = Thomas, Password = Rogers								
			JOptionPane.showMessageDialog(null, "Hello Username!");	// if user enters correct username and password then they get prompted with "Hello Username!"
		} else { // stating that Username or Password isn't correct 
			JOptionPane.showMessageDialog(null, "Wrong Username or Password!"); // since user entered wrong username or password they get prompted with "Wrong Username or Password!"															
		}
	}	
}

