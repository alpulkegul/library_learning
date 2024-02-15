// Project: Hypotenus Calculation

package Fundamentals;
import java.util.Scanner;
public class HypotenuseCalculation {
    public static void main(String[] args) {
        double a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 'a' side: ");
        a = input.nextDouble();
        System.out.print("Enter the 'b' side: ");
        b = input.nextDouble();
        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hypotenuse: " + c);

        // program 2

        /*double height,base,perimeter,area;

        System.out.print("Enter the 'a' side: ");
        a = input.nextDouble();
        System.out.print("Enter the 'b' side: ");
        b = input.nextDouble();
        System.out.print("Enter the 'c' side: ");
        c = input.nextDouble();
        System.out.print("Enter the base value: ");
        base = input.nextDouble();
        System.out.print("Enter the height value: ");
        height = input.nextDouble();
        perimeter = a+b+c;
        area = base * height / 2;
        System.out.println("Perimeter of a triangle: " + perimeter);
        System.out.print("Area of a triangle: " + area);*/
    }
}