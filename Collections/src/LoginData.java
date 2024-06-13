import java.util.ArrayList;
import java.util.Scanner;


class LoginData {

    private String username;
    private int password;

    public LoginData(String username, int password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public int getPassword() {
        return password;
    }
}
