import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.*;

public class Login {
    public static void main(String[] args) {

        ArrayList<LoginData> loginDataList = new ArrayList<>();
        LoginData loginData1 = new LoginData("amitsaini", 1234);
        LoginData loginData2 = new LoginData("alok", 1234);
        LoginData loginData3 = new LoginData("saini", 1234);
        LoginData loginData4 = new LoginData("amit", 1234);

        loginDataList.add(loginData1);
        loginDataList.add(loginData2);
        loginDataList.add(loginData3);
        loginDataList.add(loginData4);

        Scanner sc = new Scanner(in);
        out.print("Enter Username: ");
        String UN = sc.nextLine();
        out.print("Enter Password: ");
        int P = sc.nextInt();

        // Check if the entered username and password are valid
      try {
          boolean isValid = false;
          for (LoginData loginData : loginDataList) {
              if (loginData.getUsername().equals(UN) && loginData.getPassword() == P) {
                  isValid = true;
                  break;
              }
          }

          if (isValid) {
              out.println("Login Successful");
          } else {
              out.println("Invalid Username or Password");
          }

      } catch (InputMismatchException e) {
          throw new RuntimeException(e);
      }
    }
}
