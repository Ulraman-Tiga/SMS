package logic.FileHelper;

import java.io.File;

import data.FileHelper.NormalFileHelper;

public class SpecialFileHelper {
	 private static SpecialFileHelper specialFileHelper;
	    public static SpecialFileHelper getInstance(){
	        if(specialFileHelper==null){
	            specialFileHelper=new SpecialFileHelper();
	        }
	        return specialFileHelper;
	    }
	    public static File createFileByPath(String path){
	        return new File(NormalFileHelper.getInstance().getProjectPath()+"User/"+path);
	    }

	    public String getProjectPath(){
	        return this.getClass().getResource("/").getPath();
	    }
}
