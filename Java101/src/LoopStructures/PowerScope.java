//Project: Power Scope

package LoopStructures;
import java.util.Scanner;
public class PowerScope {
    public static void main(String[] args) {
        int n;
        Scanner x = new Scanner(System.in);
       /* System.out.println("Enter of number: ");
        n = x.nextInt();
        for(int i = 1; i<=n;i*=2){

            System.out.println(i);
        }*/
        int i = 1, j = 1, k = 0;
        System.out.println("Enter of number: ");
        n = x.nextInt();
        do{
            k++;
            i*=4;
            j*=5;
            System.out.println("4^"+k+"="+i);
            System.out.println("5^"+k+"="+j);
        }while(i<=n || j<=n);

    }


}
