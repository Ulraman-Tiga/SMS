package util;

public enum CheckUserMessage {
    SIGNIN_SUCCESS("登录成功"),
    USER_NOT_EXIST("用户名不存在"),
    PASSWORD_WRONG("密码错误");

    private String message;
    CheckUserMessage(String message) {
        this.message=message;
    }

    public String getMessage() {
        return message;
    }
}
