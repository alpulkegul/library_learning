package Others;

import java.util.*;
public class Dongu_ToplamaOyunu {
    public static void main(String[] args) {
        Random rastgele = new Random();
        Scanner input = new Scanner(System.in);
        int s1,s2,toplam,cevap;
        while (true) {
            s1 = rastgele.nextInt(100) + 1;
            s2 = rastgele.nextInt(100) + 1;

            toplam = s1 + s2;
            System.out.print(s1 + "+" + s2 + "= ");
            cevap = input.nextInt();

            if (toplam == cevap) {
                System.out.println("Tebrikler!");
                continue;
            } else {
                System.out.println("Yanlış Cevap!");
                break;
            }


        }
    }



}
