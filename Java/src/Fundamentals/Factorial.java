package Fundamentals;

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir Sayi giriniz: ");
        int x = input.nextInt();

        int sayac = x;
        long factorial = 1;
        while (sayac > 1){
            factorial*=sayac;
            sayac --;
        }
        System.out.println(factorial);
    }
}
