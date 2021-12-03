package myhw.lesson8;

public class Credentials {

    public boolean checkCredentials(String credLogin, String passLogin) {
        final String login = "admin";
        final String password = "qwerty";
        return credLogin.equals(login) && passLogin.equals(password);
    }
}
