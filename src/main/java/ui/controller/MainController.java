package ui.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import ui.Main;

public class MainController {
	public void creatUser() throws Exception{
		 Parent toUserCreate_confirm=FXMLLoader.load(getClass().getResource("../../createUser.fxml"));
	     Main.getPrimaryStage().setScene(new Scene(toUserCreate_confirm));
	}
	public void login() throws Exception{
		 Parent toUserCreate_confirm=FXMLLoader.load(getClass().getResource("../../UserLogin.fxml"));
	     Main.getPrimaryStage().setScene(new Scene(toUserCreate_confirm));
	}
}
