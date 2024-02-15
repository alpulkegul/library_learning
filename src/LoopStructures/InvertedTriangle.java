//Project: Inverted Triangle

package LoopStructures;
import java.util.Scanner;
public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of digits: ");
        int dig = scan.nextInt();

        for(int i = dig; i >= 1; i--)
        {
            for(int j = 0; j < dig - i; j++)
            {
                System.out.print(" ");
            }
            for(int k = 1; k <= 2 * i - 1; k++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
