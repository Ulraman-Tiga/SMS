package ui.controller;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.fxml.*;

import javafx.event.*;
import javafx.fxml.FXMLLoader;
import logicServiceFactory.UserLogicServiceFactory;
import ui.Main;
import vo.UserVO;
public class UserCreate {
	
	@FXML
	private TextField txt1;
	@FXML
	private TextField txt2;

	public void initialize() {
		
	}
	public void confirm(ActionEvent event ) {
		System.out.println(txt1.getText());
		UserLogicServiceFactory.getUserLogicService().signUp(new UserVO(txt1.getText(),txt2.getText()));
		
		
	}
	public void cancel(ActionEvent event)throws Exception {
		Parent returnmain= FXMLLoader.load(getClass().getResource("../../Main_user.fxml"));
		
        Main.getPrimaryStage().setScene(new Scene(returnmain));
	}
	
}
