//Project: Exponential Number Calculation

package LoopStructures;
import java.util.Scanner;
public class ExponentialNumberCalculation {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);
        /*int exp, base, total = 1;
        System.out.println("Enter the base value: ");
        base = ex.nextInt();
        System.out.println("Enter the exponent value: ");
        exp = ex.nextInt();
        int i=1;
        do {
            total *= base;
            i++;
        }while (i<=exp);

        System.out.println(+base+"^"+exp +"=" + total);*/

        int base, exp,total = 1;
        System.out.println("Enter the base value: ");
        base = ex.nextInt();
        System.out.println("Enter the exponent value: ");
        exp = ex.nextInt();
        for (int i = 1; i<=exp;i++)
            total *= base;
        System.out.println(+base+"^"+exp+"=" + total);

    }
}
