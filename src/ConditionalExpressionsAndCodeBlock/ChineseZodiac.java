//Project: Chinese Zodiac

package ConditionalExpressionsAndCodeBlock;
import java.util.Scanner;
public class ChineseZodiac {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        year = input.nextInt();
        int result = year % 12;
        switch(result){
            case 0:
                System.out.print("Your Chinese Zodiac sign: Monkey");
                break;
            case 1:
                System.out.print("Your Chinese Zodiac sign: Rooster");
                break;
            case 2:
                System.out.print("Your Chinese Zodiac sign: Dog");
                break;
            case 3:
                System.out.print("Your Chinese Zodiac sign: Pig");
                break;
            case 4:
                System.out.print("Your Chinese Zodiac sign: Rat");
                break;
            case 5:
                System.out.print("Your Chinese Zodiac sign: Ox");
                break;
            case 6:
                System.out.print("Your Chinese Zodiac sign: Tiger");
                break;
            case 7:
                System.out.print("Your Chinese Zodiac sign: Rabbit");
                break;
            case 8:
                System.out.print("Your Chinese Zodiac sign: Dragon");
                break;
            case 9:
                System.out.print("Your Chinese Zodiac sign: Snake");
                break;
            case 10:
                System.out.print("Your Chinese Zodiac sign: Horse");
                break;
            case 11:
                System.out.print("Your Chinese Zodiac sign: Sheep");
                break;


        }

    }
}
