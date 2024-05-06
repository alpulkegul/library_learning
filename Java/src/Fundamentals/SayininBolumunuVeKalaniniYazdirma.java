package Fundamentals;

import java.sql.SQLOutput;
import java.util.Scanner;
public class SayininBolumunuVeKalaniniYazdirma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bölmek istediğiniz sayi: ");
        int x = input.nextInt();
        System.out.println("Bölen sayi: ");
        int bolen = input.nextInt();

        int sonuc = x / bolen;
        int kalan = x % bolen;
        System.out.println("Sayi: " + x);
        System.out.println("Bölen: " + bolen);
        System.out.println("Sonuç: " + sonuc);
        System.out.println("Kalan: " + kalan);

    }
}
