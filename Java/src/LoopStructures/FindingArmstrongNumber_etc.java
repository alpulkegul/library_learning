//Project: Finding Armstrong Number etc.

package LoopStructures;
import java.util.Scanner;
public class FindingArmstrongNumber_etc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //Finding the number of digits
        /*int a,numberDigits,numberCounter=0;
        System.out.println("Enter the number you want to find the number of digits: ");
        a = input.nextInt();
        while(a != 0){
            a/=10;
            System.out.println(a);
            numberCounter++;

        }
        System.out.println(numberCounter);*/

        /*System.out.println("Enter the number: ");
        int number = input.nextInt();
        int digNumber = 0;
        int tempNumber = number;
        int digValue;
        int digPow;
        int result =0;

        while(tempNumber != 0){
            tempNumber /= 10;
            digNumber++;
        }
        tempNumber = number;

        while(tempNumber!=0){
            digValue = tempNumber % 10;
            digPow = 1;
            for (int i = 1; i<=digNumber;i++){
                digPow *= digValue;
            }
            result += digPow;
            tempNumber /= 10;
        }

        if(result == number)
            System.out.println(result + " is an armstrong number.");
        else
            System.out.println(number + " is not an armstrong number.");*/

        // Write a programme that calculates the sum of the digits of a number.

        System.out.println("Enter the number: ");
        int numb = input.nextInt();
        int digNumb, total = 0;
        while(numb != 0){
            digNumb = numb % 10;
            total += digNumb;
            numb /= 10;
        }
        System.out.println("Total: " + total);

    }
}
