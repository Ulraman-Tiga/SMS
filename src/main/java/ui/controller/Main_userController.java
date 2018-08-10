package ui.controller;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import ui.Main;
import javafx.fxml.*;
import javafx.event.*;
import javafx.fxml.FXMLLoader;

public class Main_userController {
	public void initialize() {
		
	}
	public void login(ActionEvent event) throws Exception {
		Parent to_login= FXMLLoader.load(getClass().getResource("../../UserLogin.fxml"));
		
        Main.getPrimaryStage().setScene(new Scene(to_login));
	}
	public void new_user(ActionEvent event) throws Exception {
		Parent to_create= FXMLLoader.load(getClass().getResource("../../createUser.fxml"));
		
        Main.getPrimaryStage().setScene(new Scene(to_create));
	}
}
