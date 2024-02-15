//Project: Bushing Program

package ConditionalExpressionsAndCodeBlock;
import java.util.Scanner;
public class BushingProgram {
    public static void main(String[] args) {
        int month,day;
        String bushing = "";
        boolean isError = false;
        Scanner burclar = new Scanner(System.in);
        System.out.println("Month of birth (in numbers): ");
        month = burclar.nextInt();
        System.out.println("Day of birth: ");
        day = burclar.nextInt();

        switch(month){
            case 1:
                if(day >=1 && day <=31){
                    if(day < 22){
                        bushing = "Capricorn";
                    }else {
                        bushing = "Aquarius";
                    }

                }else{
                    isError = true;
                }
                break;
            case 2:
                if(day >=1 && day <=29){
                    if(day < 20){
                        bushing = "Aquarius";
                    }else {
                        bushing = "Pisces";
                    }

                }else{
                    isError = true;
                }
                break;
            case 3:
                if(day >=1 && day <=31){
                    if(day < 21){
                        bushing = "Pisces";
                    }else {
                        bushing = "Aries";
                    }

                }else{
                    isError = true;
                }
                break;

            case 4:
                if(day >=1 && day <=30){
                    if(day < 2){
                        bushing = "Aries";
                    }else {
                        bushing = "Taurus";
                    }

                }else{
                    isError = true;
                }
                break;

            case 5:
                if(day >=1 && day <=31){
                    if(day < 22){
                        bushing = "Taurus";
                    }else {
                        bushing = "Gemini";
                    }

                }else{
                    isError = true;
                }
                break;

            case 6:
                if(day >=1 && day <=30){
                    if(day < 23){
                        bushing = "Gemini";
                    }else {
                        bushing = "Cancer";
                    }

                }else{
                    isError = true;
                }
                break;

            case 7:
                if(day >=1 && day <=31){
                    if(day < 23){
                        bushing = "Cancer";
                    }else {
                        bushing = "Leo";
                    }

                }else{
                    isError = true;
                }
                break;

            case 8:
                if(day >=1 && day <=31){
                    if(day < 23){
                        bushing = "Leo";
                    }else {
                        bushing = "Virgo";
                    }

                }else{
                    isError = true;
                }
                break;

            case 9:
                if(day >=1 && day <=30){
                    if(day < 23){
                        bushing = "Virgo";
                    }else {
                        bushing = "Libra";
                    }

                }else{
                    isError = true;
                }
                break;

            case 10:
                if(day >=1 && day <=31){
                    if(day < 23){
                        bushing = "Libra";
                    }else {
                        bushing = "Scorpio";
                    }

                }else{
                    isError = true;
                }
                break;

            case 11:
                if(day >=1 && day <=30){
                    if(day < 22){
                        bushing = "Scorpio";
                    }else {
                        bushing = "Sagittarius";
                    }

                }else{
                    isError = true;
                }
                break;

            case 12:
                if(day >=1 && day <=31){
                    if(day < 22){
                        bushing = "Sagittarius";
                    }else {
                        bushing = "Capricorn";
                    }

                }else{
                    isError = true;
                }
                break;


            default:
                isError = true;
        }
        if(isError){
            System.out.println("You entered an invalid day/month.");
        }else {
            System.out.println("Your bushing: " + bushing);
        }

    }
}
