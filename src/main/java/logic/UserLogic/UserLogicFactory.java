package logic.UserLogic;

public class UserLogicFactory {
    public static CurrentUserService getCurrentUserService(){
        // TODO
        return new CurrentUserServiceImpl();
    }
}
