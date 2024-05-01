//Project: Advanced Calculator

package Methods;
import javax.swing.*;
import java.util.Scanner;
public class AdvancedCalculator {

    static int sum(int a, int b){
        int result = a + b;;

        System.out.println(" "+a+" + "+b+" = " + result);
        return result;
    }
    static int sub(int a, int b){
        int result = a-b;
        System.out.println(" "+a+" - "+b+" = " + result);
        return result;
    }
    static int mul(int a, int b){
        int result = a * b;
        System.out.println(" "+a+" * "+b+" = " + result);
        return result;
    }
    static double div(double a, double b) {
        double result = a / b;
        System.out.println(" " + a + " / " + b + " = " + result);
        return result;
    }
    static int mod(int a, int b){
        int result = a % b;
        System.out.println(" "+a+" % "+b+" = " + result);
        return result;
    }

    static int exp(int a, int b){
        int result = 1;
        for(int i = 1; i <= b; i++){
            result *= a;
        }
        return result;
    }

    static void rec(int a, int b){
        int n=2,area,perimeter;
        area = a*b;
        System.out.println("Area = " + area);
        perimeter = n*(a+b);
        System.out.println("Perimeter = " + perimeter);


    }

    public static void main(String[] args) {
        Scanner calculator = new Scanner(System.in);
        byte select;
        String menu =   "1. Sum Process\n"+
                        "2. Subtraction Process\n"+
                        "3. Multiplication Process\n"+
                        "4. Division Process\n"+
                        "5. Exponential Number Calculation\n"+
                        "6. Mode Calculation\n"+
                        "7. Rectangular Area & Perimeter Calculation\n"+
                        "8. Exit\n";



        while (true){
            System.out.println(menu);
            System.out.println("Select the operation you want to perform:");
            select = calculator.nextByte();
            if(select == 8){
                break;
            }
            else if (select == 5) {
                int a,b;
                System.out.println("Enter base value: ");
                a = calculator.nextInt();
                System.out.println("Enter exponent value: ");
                b = calculator.nextInt();
                System.out.println(exp(a, b));
            }
            else if (select == 7) {
                int a,b;
                System.out.println("Enter the long side: ");
                a = calculator.nextInt();
                System.out.println("Enter the short side: ");
                b = calculator.nextInt();
                rec(a, b);

            }

            else if (select <= 0 || select >=9){
                System.out.println("Error! Try Again.\n");
            }else{
                System.out.println("Enter first number: ");
                int a = calculator.nextInt();
                System.out.println("Enter second number: ");
                int b = calculator.nextInt();
                switch (select){
                    case 1:
                        sum(a, b);
                        break;
                    case 2:
                        sub(a,b);
                        break;
                    case 3:
                        mul(a, b);
                        break;
                    case 4:

                        if (b == 0){
                            System.out.println("The second number must be different from zero.");
                        }else {
                            div(a, b);
                        }
                        break;
                    case 6:
                        mod(a,b);
                        break;
                    default:
                }

            }

        }
        System.out.println("Goodbye :)");

    }


}
