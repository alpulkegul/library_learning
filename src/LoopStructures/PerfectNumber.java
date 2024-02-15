//Project: Perfect Number

package LoopStructures;
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int numb = scan.nextInt();
        int total = 0;

        for (int i = 1; i < numb; i++)
        {
            if(numb % i == 0)
            {
                total += i;
            }
        }
        if(total == numb)
        {
            System.out.print(numb + " is perfect number.");
        }
        else
        {
            System.out.print(numb + " is not perfect number.");
        }
    }
}
