package vo;

public class UserVO {
    private String username;
    private String password;

    public UserVO(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
