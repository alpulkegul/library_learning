//Project: Grade Point Average Calculation Program

package ConditionalExpressionsAndCodeBlock;
import java.util.Scanner;
public class GPACalculation {
    public static void main(String[] args) {
        /*double math, physics, music,turkish,chemistry, average,numbLesson=5;
        Scanner scan = new Scanner(System.in);
        System.out.print("Math grade: ");
        math = scan.nextDouble();
        System.out.print("Physics grade: ");
        physics = scan.nextDouble();
        System.out.print("Music grade: ");
        music = scan.nextDouble();
        System.out.print("Turkish grade: ");
        turkish = scan.nextDouble();
        System.out.print("Chemistry grade: ");
        chemistry = scan.nextDouble();
        average = (math+physics+music+turkish+chemistry)/numbLesson;
        if(average >= 55 ){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }*/

        double math, physics, chemistry, music, turkish, average;
        int numbLesson = 5;
        int reduceLesson = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Math grade: ");
        math = scan.nextDouble();
        System.out.println("Physics grade: ");
        physics = scan.nextDouble();
        System.out.println("Chemistry grade: ");
        chemistry = scan.nextDouble();
        System.out.println("Turkish grade: ");
        turkish = scan.nextDouble();
        System.out.println("Music grade: ");
        music = scan.nextDouble();
        if (math < 0 || math > 100) {
            average = (turkish + music + chemistry + physics) / (numbLesson - 1);
            if (average >= 55) {
                System.out.println("Passed. Your average: " + average);
            } else {
                System.out.println("Failed. Your average: " + average);
            }

        }
        if (physics < 0 || physics > 100) {
            average = (turkish + music + chemistry + math) / (numbLesson - 1);
            if (average >= 55) {
                System.out.println("Passed. Your average: " + average);
            } else {
                System.out.println("Failed. Your average: " + average);
            }

        }
        if (music < 0 || music > 100) {
            average = (turkish + math + chemistry + physics) / (numbLesson - 1);
            if (average >= 55) {
                System.out.println("Passed. Your average: " + average);
            } else {
                System.out.println("Failed. Your average: " + average);
            }

        }
        if (turkish < 0 || turkish > 100) {
            average = (math + music + chemistry + physics) / (numbLesson - 1);
            if (average >= 55) {
                System.out.println("Passed. Your average: " + average);
            } else {
                System.out.println("Failed. Your average: " + average);
            }

        }
        if (chemistry < 0 || chemistry > 100) {
            average = (turkish + music + math + physics) / (numbLesson - 1);
            if (average >= 55) {
                System.out.println("Passed. Your average: " + average);
            } else {
                System.out.println("Failed. Your average: " + average);
            }
        }
    }
}