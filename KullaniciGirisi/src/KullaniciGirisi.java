import javax.swing.*;
import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {

        String password, userName, newPassword, resetPassword;

        Scanner inp = new Scanner(System.in);

        System.out.println("Please enter your User Name : ");
        userName = inp.nextLine();
        System.out.println("Please enter your Password : ");
        password = inp.nextLine();

        if (userName.equals("ilayda") && password.equals("1234")) ;
        {
            System.out.println("You are logged in!");
        }
        else {
            System.out.println("Your informations were wrong ! \nIf you want to specify a new password, select \"no\" or \"yes\"");
            resetPassword = inp.nextLine();

            if (resetPassword.equals("no")) {
                System.out.println("Login terminated ! ");
            } else if (resetPassword.equals("yes")) {
                System.out.println("Type your new password. ");
                newPassword = inp.nextLine();
                if (newPassword.equals("1234") || newPassword.equals("password")) {
                    System.out.println("Incorrect password. Please try again!");
                } else {
                    System.out.println("Your password has been changed succesfully!");
                }

            } else {
                System.out.println("You made the wrong choice");
            }
        }

    }


}
