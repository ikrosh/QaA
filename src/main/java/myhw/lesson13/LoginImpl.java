package myhw.lesson13;

import java.util.Scanner;

public class LoginImpl {
    private static boolean result;

    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your login:");
        String credLogin = scanner.nextLine();
        System.out.println("Enter your password:");
        String passLogin = scanner.nextLine();
        System.out.println("Confirm your password:");
        String passConfirm = scanner.nextLine();

        if (!credLogin.equals("") && !passLogin.equals("") && !passConfirm.equals("")) {
            result = CredentialsCheck.checkCredentials(credLogin, passLogin, passConfirm);
            System.out.println(result);
        } else {
            System.out.println("Entered data should not be empty!");
        }
    }

}
