//Project: Air Ticket Price

package ConditionalExpressionsAndCodeBlock;
import java.util.Scanner;
public class AirTicketPrice {
    public static void main(String[] args) {
        double perKM;
        int age;
        byte tripType;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the distance in KM: ");
        perKM = input.nextDouble();
        System.out.println("Enter your age:");
        age = input.nextInt();
        System.out.println("Enter the type of journey (1 -> One Way / 2 -> Round-trip)");
        tripType = input.nextByte();
        if(perKM>=0 && age >=0 && (tripType == 1 || tripType == 2)){
            if (age < 12){
                double normalAmount =  perKM * 0.10;
                double ageDiscount = normalAmount * 0.5;
                double discountedAmount = normalAmount - ageDiscount;
                double roundTripTicketDiscount = discountedAmount*0.20;
                double totalAmount = (normalAmount - ageDiscount - roundTripTicketDiscount) * 2;
                System.out.println("Normal Amount: " + normalAmount);
                System.out.println("Age Discount: " + ageDiscount);
                if (tripType == 2){
                    System.out.println("Round-trip Ticket Discount " + roundTripTicketDiscount);
                    System.out.println("Total Amount: " + totalAmount);

                }else {
                    System.out.println("Total Amount: " + (normalAmount - ageDiscount));
                }



            } else if (age >= 12 && age <=24) {
                double normalAmount =  perKM * 0.10;
                double ageDiscount = normalAmount * 0.1;
                double discountedAmount = normalAmount - ageDiscount;
                double roundTripTicketDiscount = discountedAmount*0.20;
                double totalAmount = (normalAmount - ageDiscount - roundTripTicketDiscount) * 2;
                System.out.println("Normal Amount: " + normalAmount);
                System.out.println("Age Discount: " + ageDiscount);
                if (tripType == 2){
                    System.out.println("Round-trip Ticket Discount: " + roundTripTicketDiscount);
                    System.out.println("Total Amount: " + totalAmount);

                }else {
                    System.out.println("Total Amount: " + (normalAmount - ageDiscount));
                }

                
            } else if (age > 65) {
                double normalAmount =  perKM * 0.10;
                double ageDiscount = normalAmount * 0.3;
                double discountedAmount = normalAmount - ageDiscount;
                double roundTripTicketDiscount = discountedAmount*0.20;
                double totalAmount = (normalAmount - ageDiscount - roundTripTicketDiscount) * 2;
                System.out.println("Normal Amount: " + normalAmount);
                System.out.println("Age Discount: " + ageDiscount);
                if (tripType == 2){
                    System.out.println("Round-trip Ticket Discount: " + roundTripTicketDiscount);
                    System.out.println("Total Amount: " + totalAmount);

                }else {
                    System.out.println("Total Amount: " + (normalAmount - ageDiscount));
                }
                
            }else {
                double normalAmount =  perKM * 0.10;
                double roundTripTicketDiscount = normalAmount*0.20;
                double totalAmount = (normalAmount-roundTripTicketDiscount)*2;
                System.out.println("Amount: " + normalAmount);
                if(tripType == 2){
                    System.out.println("Round-trip Ticket Discount: "+roundTripTicketDiscount);
                    System.out.println("Total Amount: " + totalAmount);
                }


            }


        }else{
            System.out.println("You entered incorrect data!");
        }


    }
}
