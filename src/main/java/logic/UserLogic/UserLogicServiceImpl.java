package logic.UserLogic;
import java.io.*;

import data.FileHelper.NormalFileHelper;
import logicservice.UserLogicService;

import vo.UserVO;

public class UserLogicServiceImpl implements UserLogicService{

	File f=NormalFileHelper.createFileByPath("userinform.txt");
	@Override
	public boolean logIn(UserVO userVO) {//登录
		// TODO 自动生成的方法存根
		String userInform=null;
		boolean flag=true;
		try {
			BufferedReader br=new BufferedReader(new FileReader(f));
			while((userInform=br.readLine())!=null) {
				String []data=userInform.split(" ");
				if(data[0].equals(userVO.getUsername())&&data[1].equals(userVO.getPassword())) {
					flag=true;
					break;
					
				}else {
					flag=false;
					}
				
			}
			br.close();
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		return flag;
		
	}

	

	@Override
	public void signUp(UserVO userVO) {//注册
		// TODO 自动生成的方法存根
		if(userVO.getUsername()!=null) {
			
			try {
				BufferedWriter bw=new BufferedWriter(new FileWriter(f,true));
				bw.write(userVO.getUsername().toString()+" "+userVO.getPassword().toString());
				bw.newLine();
				bw.flush();
				bw.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}

	@Override
	public boolean signOut() {//登出
		// TODO 自动生成的方法存根
		
		return false;
	}

	
}
