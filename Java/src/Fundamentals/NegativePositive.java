package Fundamentals;

import java.util.Scanner;
public class NegativePositive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        double s = input.nextDouble();

        if(s < 0)
            System.out.println("Girdiğiniz sayı negatiftir.");
        else if (s > 0)
            System.out.println("Girdiğiniz sayı pozitiftir.");
        else
            System.out.println("Girdiğiniz sayı negatif ya da pozitif değildir.");
    }
}
