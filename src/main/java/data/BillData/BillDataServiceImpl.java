package data.BillData;

import data.FileHelper.NormalFileHelper;
import dataservice.BillDataService;
import po.BillPO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BillDataServiceImpl implements BillDataService {

    private String getBillFilePath(String username){
        File f=NormalFileHelper.createFileByPath("billData/"+username);
        if(!f.exists()){
            f.mkdirs();
        }
        return f.getPath();
    }
    @Override
    public boolean createBill(BillPO billPO) {
        String username=billPO.getUsername();
        File billFile=new File(getBillFilePath(username)+billPO.getGameName()+".dat");
        if(!billFile.exists()){
            try {
                billFile.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(billFile));
            bufferedWriter.append(billPO.getGameName());
            bufferedWriter.newLine();
            bufferedWriter.append(billPO.getDate());
            bufferedWriter.newLine();
            bufferedWriter.append(billPO.getPrice()+"");
            bufferedWriter.newLine();
            bufferedWriter.append(billPO.getComment());
            bufferedWriter.flush();
            bufferedWriter.close();
        }catch(IOException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean deleteBill(BillPO billPO) {
        File billFile=new File(getBillFilePath(billPO.getUsername())+billPO.getGameName()+".dat");
        if(billFile.exists()){
            return billFile.delete();
        }
        return true;
    }

    @Override
    public boolean modifyBill(BillPO billPO) {
        boolean deleteResult=deleteBill(billPO);
        if(deleteResult){
            return createBill(billPO);
        }
        return false;
    }

    @Override
    public List<BillPO> getBillListByUser(String username) {
        File[] files=new File(getBillFilePath(username)).listFiles();
        ArrayList<BillPO> billPOArrayList=new ArrayList<>();
        for(File file:files){
            try{
                BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
                String gameName=bufferedReader.readLine();
                String date=bufferedReader.readLine();
                double price=Double.parseDouble(bufferedReader.readLine());
                String comment=bufferedReader.readLine();
                BillPO billPO=new BillPO(username,gameName,date,price,comment);
                billPOArrayList.add(billPO);
                bufferedReader.close();
            }catch (IOException e){
                e.printStackTrace();
                return null;
            }
        }
        return billPOArrayList;
    }
}
