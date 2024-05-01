//Project: Grade Point Average Calculation

package Fundamentals;
import java.util.Scanner;
public class GPACalculation {
    public static void main(String[] args) {
        double math, physics, turkish, music, chemistry, history;
        Scanner input = new Scanner(System.in);
        System.out.print("Math grade: ");
        math = input.nextDouble();
        System.out.print("Physics grade: ");
        physics = input.nextDouble();
        System.out.print("Turkish grade: ");
        turkish = input.nextDouble();
        System.out.print("Music grade: ");
        music = input.nextDouble();
        System.out.print("Chemistry grade: ");
        chemistry = input.nextDouble();
        System.out.print("History grade: ");
        history = input.nextDouble();
        double average = (math+physics+turkish+music+chemistry+history)/6;
        System.out.println("Grade point average: " + average);
        String status = (average >=60) ? "Passed" : "Failed";
        System.out.print("Status: " + status);
    }
}