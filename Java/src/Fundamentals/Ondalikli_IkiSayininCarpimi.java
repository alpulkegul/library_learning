package Fundamentals;

import java.util.Scanner;
public class Ondalikli_IkiSayininCarpimi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayi: ");
        double x = input.nextDouble();
        System.out.print("İkinci sayi: ");
        double y = input.nextDouble();

        double carpim = x * y;
        System.out.println(x + "*" + y + "=" + carpim);
    }


}
