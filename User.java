package model;

public class User {
    private String login;
    private String password;
    private String email;
    private String roleId;

    public User(String login, String password, String email, String roleId) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.roleId = roleId;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getLogin() {
        return login;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
