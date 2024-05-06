package Fundamentals;

import java.util.Scanner;
public class IkiSayininToplamiUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayi: ");
        double x = input.nextDouble();
        System.out.print("İkinci Sayi: ");
        double y = input.nextDouble();

        double toplam = x + y;

        System.out.println(x + " + " + y + " = " + toplam);

    }
}
