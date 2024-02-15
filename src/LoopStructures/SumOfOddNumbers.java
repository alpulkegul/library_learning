//Project: Sum of Odd Numbers

package LoopStructures;
import java.util.Scanner;
public class SumOfOddNumbers {
    public static void main(String[] args) {
        /*int a;
        int total = 0;
        Scanner x = new Scanner(System.in);

        do {
            System.out.println("Enter the number: ");
            a = x.nextInt();
            if(a%2 == 1){
                total +=a;
            }
        }while(a>0);
        System.out.println("Total: " + total);*/


        int n;
        int total = 0;
        Scanner xx = new Scanner(System.in);
        do{
            System.out.println("Enter the number: ");
            n = xx.nextInt();
            if(n % 4 == 0){
                total += n;
            }
        }while(n % 2 == 0);
        System.out.println("Total: " + total);
    }
}
