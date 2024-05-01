// Project: Finding Circle Area and Perimeter

package Fundamentals;
import java.util.Scanner;
public class FindingCircleAreaAndPerimeter {
    public static void main(String[] args) {
        double r,area,perimeter;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle ");
        r = input.nextDouble();
        area = Math.PI * r * r;
        perimeter = 2 * Math.PI * r;
        System.out.println("Circle area: " + area);
        System.out.println("Circle perimeter: " + perimeter);


        //program 2

        /*double pi=3.14,r,a,areaAngle;
        Scanner centerAngle = new Scanner(System.in);
        System.out.print("Enter the radius of the circle ");
        r = centerAngle.nextDouble();
        System.out.print("Enter the measure of the center angle: ");
        a = centerAngle.nextDouble();
        areaAngle = (pi*(r*r)*a)/360;
        System.out.println("Area of the circle segment: " + areaAngle);*/
    }
}