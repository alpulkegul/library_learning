//Project: Sorting Numbers From Largest to Smallest

package ConditionalExpressionsAndCodeBlock;
import java.util.Scanner;
public class SortingNumbersFromLargestToSmallest {
    public static void main(String[] args) {
        int a, b, c;
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the number 'a': ");
        a = x.nextInt();
        System.out.print("Enter the number 'b': ");
        b = x.nextInt();
        System.out.print("Enter the number 'c': ");
        c = x.nextInt();

        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println("" + a + ">" + b + ">" + c);
            } else {
                System.out.println("" + a + ">" + c + ">" + b);
            }
        } else if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.println("" + b + ">" + a + ">" + c);
            } else {
                System.out.println("" + b + ">" + c + ">" + a);
            }

        } else {
            if (b > a) {
                System.out.println("" + c + ">" + b + "" + a);
            } else {
                System.out.println(""+c+">"+a+">"+b);
            }


        }
    }
}
