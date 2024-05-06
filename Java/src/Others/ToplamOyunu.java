package Others;

import java.util.*;

public class ToplamOyunu {
    public static void main(String[] args) {
        int toplam = 0;
        Random rastgele = new Random();
        Scanner input = new Scanner(System.in);
        int sayi1 = rastgele.nextInt(100)+1;
        int sayi2 = rastgele.nextInt(100)+1;

        toplam = sayi1 + sayi2;
        System.out.print(sayi1 + "+" + sayi2 + "= ");
        int cevap = input.nextInt();
        if (toplam == cevap) {
            System.out.println("Tebrikler!");
        } else {
            System.out.println("Yanlış Cevap!");
        }

    }
}
