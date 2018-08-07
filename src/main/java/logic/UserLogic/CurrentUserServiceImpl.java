package logic.UserLogic;

import java.io.BufferedReader;
import java.io.FileReader;

public class CurrentUserServiceImpl implements CurrentUserService{
	
	//File write=NormalFileHelper.createFileByPath("Currentuser.txt");
	String user;
	@Override
	public String getCurrentUser() {
		try {
			BufferedReader br=new BufferedReader(new FileReader("d:/github/SMS/target/classes/Currentuser.txt"));
			user=br.readLine();
		}catch(Exception e) {}
		return user;
	}
	
}
