package logicServiceFactory;

import logic.UserLogic.UserLogicServiceImpl;
import logicservice.UserLogicService;

public class UserLogicServiceFactory {
    public static UserLogicService getUserLogicService(){
        // TODO
        return new UserLogicServiceImpl();
    }
}
