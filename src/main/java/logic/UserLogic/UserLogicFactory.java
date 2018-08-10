package logic.UserLogic;

public class UserLogicFactory {
    public static CurrentUserService getCurrentUserService(){
        // TODO

        return new CurrentUserServiceImpl();

       /*return new CurrentUserService() {
            @Override
            public String getCurrentUser() {
                return "testUser";
            }
        };*/
    }
}
