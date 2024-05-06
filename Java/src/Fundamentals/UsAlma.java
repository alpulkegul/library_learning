package Fundamentals;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class UsAlma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değeri giriniz: ");
        int taban = input.nextInt();
        System.out.print("Üs değeri giriniz: ");
        int us = input.nextInt();
        long i;
        for (i = 1; us != 0; --us) {
            i *= taban;
        }
        System.out.println(i);

    }


}
