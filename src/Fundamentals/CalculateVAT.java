//Project: Program to Calculate VAT Amount

package Fundamentals;
import java.util.Scanner;
public class CalculateVAT {
    public static void main(String[] args) {

        double amount;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price: ");
        amount = input.nextDouble();
        double vatAmount;
        vatAmount = amount + (amount * 0.18);
        if(amount<=1000){
            vatAmount = amount + (amount * 0.18);
            System.out.println("Price without VAT: " + amount);
            System.out.println("VAT rate: " + amount * 0.18);
            System.out.println("Price including VAT: " + vatAmount);
        }else {
            vatAmount = amount + (amount * 0.08);
            System.out.println("Price without VAT: " + amount);
            System.out.println("VAT rate: " + amount * 0.08);
            System.out.println("Price including VAT: " + vatAmount);
        }
    }
    }