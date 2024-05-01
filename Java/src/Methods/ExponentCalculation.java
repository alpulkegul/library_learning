//Project: ExponentCalculation

package Methods;
import java.util.Scanner;
public class ExponentCalculation {
    static int exp(int base, int exp){
        int total = 1;
        for(int i = 1; i <= exp; i++){
            total *= base;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the base value: ");
        int base = scan.nextInt();
        System.out.println("Enter the exponent value: ");
        int exp = scan.nextInt();
        System.out.println(base+"^"+exp+" = " +exp(base,exp));
    }
}
