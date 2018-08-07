package logicServiceFactory;

import logic.BillLogic.BillLogicServiceImpl;
import logicservice.BillLogicService;

public class BillLogicServiceFactory {
    public static BillLogicService getBillLogicService(){

        return new BillLogicServiceImpl();
    }
}
