//Project: Simple Calculator

package ConditionalExpressionsAndCodeBlock;
import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner calculator = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double n1 = calculator.nextDouble();
        System.out.print("Enter the second number: ");
        double n2 = calculator.nextDouble();

        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        int select;
        System.out.println("Select one of the above [1-2-3-4]");
        select = calculator.nextInt();
        double result = 0;

        switch (select) {
            case 1:
                result = n1 + n2;
                break;
            case 2:
                result = n1 - n2;
                break;
            case 3:
                result = n1 * n2;
                break;
            case 4:
                if (n2 != 0) {
                    result = n1 / n2;
                } else {
                    System.out.println("Error! A number is not divisible by zero.");
                    return;
                }
                break;
            default:
                System.out.println("You made the wrong choice. Program terminated.");

        }
        System.out.println("Result: "+ result);


    }
}
