//Project: Finding Minimum & Maximum Values from Entered Numbers

package LoopStructures;
import java.util.Scanner;
public class FindingMin_MaxValuesFromEnteredNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers will you enter: ");
        int n = input.nextInt();
        System.out.print("Enter number 1:");
        int firstNumber = input.nextInt();
        int min=firstNumber,max=firstNumber;
        if(n<=0){
            System.out.println("Error!!");
        }else {
            for(int i = 2; i<=n;i++){
                System.out.print("Enter number "+i+":");
                int number = input.nextInt();
                if (number>max){
                    max = number;
                }
                if(number < min){
                    min = number;
                }
            }
            System.out.println("Max number: "+max);
            System.out.println("Min number: "+min);
        }
    }
}
