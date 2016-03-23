import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFxAuthentication extends Application {

	public static void main(String [] args) {
		launch (args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		String correctUserName = "tjr2911";
		String correctPassword = "baseball4451";
		primaryStage.setTitle("Authentication");
		Label userNameLbl = new Label ("Username");
		Label passwordLbl = new Label ("Password");
		TextField userNameTxtFld = new TextField();
		PasswordField pwTxtFld = new PasswordField();

		Button submitBtn = new Button("Submit");
		submitBtn.setOnAction(new EventHandler<ActionEvent>() {
			String inputUserName = "";
			String inputPw = "";

			@Override
			public void handle(ActionEvent arg0) {
				inputUserName = userNameTxtFld.getText();
				inputPw = pwTxtFld.getText();
				int attempts = 0;
				boolean authenticated = false;
				do {
					if(correctUserName.equals(inputUserName) && correctPassword.equals(inputPw)) {
						JOptionPane.showMessageDialog(null, "Welcome " + inputUserName + "!");
						authenticated = true;

					} else {
						JOptionPane.showMessageDialog(null, "Fail Authentication"); 
						attempts ++;
					}
				} while (attempts < 3 && authenticated ==false);
					JOptionPane.showMessageDialog(null, "Please contact your administrator to unlock your account!");
			}
		});

		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(10);
		grid.setHgap(10);
		grid.add(userNameLbl,0,0);
		grid.add(passwordLbl,0,1);
		grid.add(userNameTxtFld,1,0);
		grid.add(pwTxtFld,1,1);
		grid.add(submitBtn,1,2);

		Scene scene = new Scene(grid, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
