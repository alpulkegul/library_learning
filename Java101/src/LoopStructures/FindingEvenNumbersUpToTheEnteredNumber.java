//Project: Finding Even Numbers Up to the Entered Number

package LoopStructures;
import java.util.Scanner;
public class FindingEvenNumbersUpToTheEnteredNumber {
    public static void main(String[] args) {
        /*int a;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        a = input.nextInt();

        for(int i = 1; i<=a;i++){
            if (i % 2 == 0){
                System.out.println(i);
            }

        }

    }*/
        double a,average;
        int counter = 0;
        double sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        a = input.nextDouble();
        for (int i = 0; i<a;i++ ){
            if(i % 3 == 0 && i % 4 == 0){
                sum += i;
                counter++;
            }
        }
        if(counter > 0){
            average = sum / counter;
            System.out.println("Average: " + average);

        }else {
            System.out.println("No number divisible by both 3 and 4 was found between 0 and" + a + ".");
        }
    }
}
