package util;

public enum CheckUserMessage {
    SIGNIN_SUCCESS("登录成功"),
    USER_NOT_EXIST("用户名不存在"),
    PASSWORD_WRONG("密码错误"),
	USER_REPEAD("用户名重复"),
	REGIST_SUCCESS("注册成功"),
	REGIST_FAIL("注册失败");

    private String message;
    CheckUserMessage(String message) {
        this.message=message;
    }

    public String getMessage() {
        return message;
    }
}
