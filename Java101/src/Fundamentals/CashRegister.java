//Project: Cash Register

package Fundamentals;
import java.util.Scanner;
public class CashRegister {
    public static void main(String[] args) {
        double pear=2.14,apple=3.67,tomato=1.11,banana=0.95,eggplant=5,total,kg;
        Scanner fruitAndVegetables = new Scanner(System.in);
        System.out.print("Pear kg: ");
        kg = fruitAndVegetables.nextDouble();
        System.out.print("Apple kg: ");
        kg = fruitAndVegetables.nextDouble();
        System.out.print("Tomato kg: ");
        kg = fruitAndVegetables.nextDouble();
        System.out.print("Banana kg: ");
        kg = fruitAndVegetables.nextDouble();
        System.out.print("Eggplant kg: ");
        kg = fruitAndVegetables.nextDouble();
        total = kg * (pear+apple+tomato+banana+eggplant);
        System.out.print("Total Amount: " + total);
    }
}