//Project: Activity Suggestion

package ConditionalExpressionsAndCodeBlock;
import java.util.Scanner;
public class ActivitySuggestion {
    public static void main(String[] args) {
        double weather;
        Scanner degree = new Scanner(System.in);
        System.out.println("How many degrees is the weather: ");
        weather = degree.nextDouble();
        if(weather <= 4 ){
            System.out.println("OK! Make a ski.");
        } else if (weather >= 5 && weather <=15) {
            System.out.println("OK! Go to the movies.");

        } else if (weather >=16 && weather <= 25) {
            System.out.println("OK! Go on a picnic");
            
        }else{
            System.out.println("OK! Go swimming");
        }


    }
}
