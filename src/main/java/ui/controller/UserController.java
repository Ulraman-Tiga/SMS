package ui.controller;

import logicServiceFactory.UserLogicServiceFactory;
import vo.UserVO;

public class UserController {
	public void creatUser() {
		UserLogicServiceFactory.getUserLogicService().signUp(new UserVO("zhp","12345"));
		System.out.println(UserLogicServiceFactory.getUserLogicService().logIn(new UserVO("zhp","12345")));
	}
}
