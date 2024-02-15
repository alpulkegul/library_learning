//Project: Prime Number

package Methods;
import java.util.Scanner;
public class PrimeNumber {
    static boolean prime(int n){
        boolean prime = true;
        if (n < 2) {

            prime = false;
        } else {
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }

            }
        }
        return prime;

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int numb;
        System.out.print("Enter the number: ");
        numb = inp.nextInt();
        if (prime(numb) == true) {

            System.out.println("The number " + numb + " is prime.");
        } else {
            System.out.println("The number " + numb + " is not prime.");
        }

    }
}
