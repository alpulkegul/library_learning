//Project: Factorial Finding

package LoopStructures;
import java.util.Scanner;
public class FactorialFinding {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        /*int a;
        int total = 1;
        System.out.println("Enter the number to calculate the factorial: ");
        a = x.nextInt();
        for(int i = 1; i <= a; i++){
            total *= i;

        }
        System.out.println(a + "! = "  + total);*/

        System.out.println("Enter the number of elements: ");
        int elements = x.nextInt();
        System.out.println("Enter the number of clusters: ");
        int cluster = x.nextInt();
        int n=1,r=1,a=1,c;

        for (int i = 1; i<=cluster;i++){
            n *= i;
        }
        for (int i = 1; i<=elements;i++){
            r *= i;
        }
        for (int i = 1; i<=(cluster-elements);i++){
            a*=i;
        }
        c = n/(r*a);
    }
}
