//Project: Taximeter Program

package Fundamentals;
import java.util.Scanner;
public class Taximeter {
    public static void main(String[] args) {
        double perKM = 2.20,total, startPrice = 10,km;
        Scanner input = new Scanner(System.in);
        System.out.println("Distance traveled in KM: ");
        km = input.nextDouble();
        total = km * perKM;
        total += startPrice;
        total = (total<20) ? 20 : + total;
        System.out.println("Your taxi debt: " + total);
    }
}