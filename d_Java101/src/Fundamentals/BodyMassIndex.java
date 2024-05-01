// Project: BMI Program

package Fundamentals;
import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {
        double tall, weight,BMI;
        Scanner bodyMassIndex = new Scanner(System.in);
        System.out.print("Enter your height in meters: ");
        tall = bodyMassIndex.nextDouble();
        System.out.print("Enter your weight: ");
        weight = bodyMassIndex.nextDouble();
        BMI = weight / (tall * tall);
        System.out.print("Your body mass index: " + BMI);

        /*
         *         BMI Table
         *         Classification	    | BMI range - kg/m2
         *         Severe Thinness	    |         < 16
         *         Moderate Thinness	|      16 - 17
         *         Mild Thinness	    |      17 - 18.5
         *         Normal	            |    18.5 - 25
         *         Overweight	        |      25 - 30
         *         Obese Class I	    |      30 - 35
         *         Obese Class II	    |      35 - 40
         *         Obese Class III	    |         > 40
         */
    }
}