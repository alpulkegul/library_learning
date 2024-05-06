package Fundamentals;

import java.util.Scanner;
public class YaziliPuaniniNotaCevirme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Notunuzu öğrenmek için yazılı puanınızı girin: ");
        int not = input.nextInt();

        if (not < 0 || not > 100)
            System.out.println("Hatalı not girdiniz.");
        else if (not < 50)
            System.out.println("1 (KALDI)");
        else if (not < 60)
            System.out.println("2 (GEÇER)");
        else if (not < 75)
            System.out.println("3 (ORTA)");
        else if (not < 85)
            System.out.println("4 (İYİ)");
        else
            System.out.println("5 (PEKİYİ)");





    }
}
