//Project: Leap year Calculation

package ConditionalExpressionsAndCodeBlock;
import java.util.Scanner;
public class LeapYearCalculation {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year you want it to be calculated:");
        year = input.nextInt();
        if(year % 4 == 0 || year % 400 ==0){
            System.out.println("" + year + " is a leap year.");
        }else{
            System.out.println("" + year + " is not a leap year.");
        }

    }
}
