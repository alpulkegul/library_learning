//Project: Fibonacci Series

package LoopStructures;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the elements number: ");
        int elementNumber = scan.nextInt();
        int firstElement = 0;
        int secondElement = 1;
        for(int i = 1; i <= elementNumber; i++)
        {
            System.out.print(firstElement + " ");
            int temp = firstElement + secondElement;
            firstElement = secondElement;
            firstElement = temp;
        }

    }
}
