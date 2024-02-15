//Project: The Greatest Common Divider and Smallest Common Flor

package LoopStructures;
import java.util.Scanner;
public class TheGreatestCommonDividerAndSmallestCommonFlor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the n1: ");
        int n1 = input.nextInt();
        System.out.print("Enter the n2: ");
        int n2 = input.nextInt();

        /*int ebob = 1;
        for (int i = 1; i<=n1;i++){
            System.out.println(i);
            if (n1 % i == 0 && (n2 % i) == 0){
                ebob = i;
                System.out.println(ebob);
            }

        }
        System.out.println("________________");
        for (int k = n1; k>=1;k--){
            System.out.println(k);
            if (n1 % k == 0 && (n2 % k)==0){
                ebob = k;
                System.out.println(ebob);
                break;
            }
        }
        */
        for (int i =1; i <= (n1*n2);i++){
            if(i%n1==0 && i%n2==0){
                System.out.println(i);
                break;
            }
        }
    }
}
