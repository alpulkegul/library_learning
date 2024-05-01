//Project: Method According to Pattern

package Methods;
import java.util.Scanner;
public class MethodAccordingToPattern {


    public static void des(int n) {
        System.out.print(n+" ");
        if (n <= 0) {
            return;
        }
        des(n - 5);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = inp.nextInt();
        des(number);
    }
}
