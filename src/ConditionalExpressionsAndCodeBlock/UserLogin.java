//Project: User login

package ConditionalExpressionsAndCodeBlock;
import java.util.Scanner;
public class UserLogin {
    public static void main(String[] args) {
        String userName, password, newPassword,y_n;
        Scanner input = new Scanner(System.in);
        System.out.print("Username: ");
        userName = input.nextLine();
        System.out.print("Password: ");
        password = input.nextLine();
        if(userName.equals("admin") && password.equals("12345")){
            System.out.println("Logged in.");
        }
        else{
            System.out.println("The password is incorrect, would you like to reset it?");
            System.out.println("yes/no");
            y_n = input.nextLine();
            if (y_n.equals("yes")){
                System.out.println("New password:");
                newPassword=input.nextLine();
                System.out.println(newPassword);
                if(newPassword.equals(password)){
                    System.out.println("You entered an old or incorrect password!");
                }else {
                    System.out.println("Password changed.");
                }
            }else {
                System.out.println("Programme terminated...");
            }
        }
    }
}