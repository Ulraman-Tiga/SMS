package logicservice;

import util.CheckUserMessage;
import vo.UserVO;

public interface UserLogicService {

    /**
     * 登录
     * @return
     */
    CheckUserMessage logIn(UserVO userVO);

    /**
     * 检查注册的用户名是否存在
     * @param username 用户名
     * @return
     */
    CheckUserMessage checkUserName(String username);

    /**
     * 注册
     * @return
     */
    CheckUserMessage signUp(UserVO userVO);
}
