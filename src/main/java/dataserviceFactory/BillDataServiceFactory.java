package dataserviceFactory;

import data.BillData.BillDataServiceImpl;
import dataservice.BillDataService;

public class BillDataServiceFactory {
    public static BillDataService getBillDataService(){
        return new BillDataServiceImpl();
    }
}
