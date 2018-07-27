package ui.controller;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.fxml.*;
import javafx.fxml.FXMLLoader;

import ui.Main;
import vo.UserVO;

import logicServiceFactory.UserLogicServiceFactory;

public class UserLogin {
	@FXML
	private TextField u_name;
	@FXML
	private TextField u_pass;
	
	public void initialize() {
		
	}
	public void login() {
		
		UserVO userinf=new UserVO(u_name.getText(),u_pass.getText());

		if(UserLogicServiceFactory.getUserLogicService().logIn(userinf)==true) {
			System.out.println("ok");
		}else {
			System.out.println("no");
		}
		
	}
	public void return_main() throws Exception{
		Parent returnmain= FXMLLoader.load(getClass().getResource("../../newUser.fxml"));
        Main.getPrimaryStage().setScene(new Scene(returnmain));
	}
}
