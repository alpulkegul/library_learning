//Project ATM

package LoopStructures;
import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int right = 3;
        String userName, password;
        int select;
        int balance = 1650;

        while(right > 0){
            System.out.print("Enter your username: ");
            userName = input.nextLine();
            System.out.print("Enter your password: ");
            password = input.nextLine();
            if (userName.equals("admin") && password.equals("12345")){
                System.out.println("Welcome to X bank!");
                do {
                    System.out.println("1. Deposit money\n"+"2. Withdraw money\n"+"3. Balance enquiry\n"+"4. Exit");
                    System.out.print("Select the operation you want to perform:");
                    select = input.nextInt();
                    if(select==1){
                        System.out.println("Amount to be deposited: ");
                        int price = input.nextInt();
                        balance += price;
                        System.out.println();
                    } else if (select == 2) {
                        System.out.println("Amount to be withdraw");
                        int price = input.nextInt();
                        if (price > balance){
                            System.out.println("Insufficient balance.");
                        }else {
                            balance -= price;
                        }
                    } else if (select == 3) {
                        System.out.println("The balance in your account: " + balance);
                    }

                }while(select != 4);
            break;



            }else {
                right--;
                System.out.println("Incorrect username or password.Try again!");
                if(right == 0){
                    System.out.println("Your account's blocked. Contact the bank!");
                }else {
                    System.out.println("You have got "+right+" left.");
                }
            }
        }

    }
}
