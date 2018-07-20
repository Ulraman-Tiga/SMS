package data.FileHelper;

import java.io.File;

public class NormalFileHelper {
    private static NormalFileHelper normalFileHelper;
    public static NormalFileHelper getInstance(){
        if(normalFileHelper==null){
            normalFileHelper=new NormalFileHelper();
        }
        return normalFileHelper;
    }
    public static File createFileByPath(String path){
        return new File(NormalFileHelper.getInstance().getProjectPath()+"data/"+path);
    }

    public String getProjectPath(){
        return this.getClass().getResource("/").getPath();
    }
}
