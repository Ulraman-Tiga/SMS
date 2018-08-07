package logicservice;

import util.CheckUserMessage;
import vo.UserVO;

public interface UserLogicService {

    /**
     * 登录
     * @return
     */
    boolean logIn(UserVO userVO);

    /**
     * 检查注册的用户名是否存在
     * @param username 用户名
     * @return
     */
   //String checkUserName(String username);

    /**
     * 注册
     * @return
     */
    void signUp(UserVO userVO);

    /**
     * 登出
     * @return
     */
    boolean signOut();
}
