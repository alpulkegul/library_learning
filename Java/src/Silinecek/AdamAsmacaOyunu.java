package Silinecek;
import java.util.*;
public class AdamAsmacaOyunu {

    static String harf;
    static int dogru=0;
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String gizliKelime[] = {"telefon"};
        Random rastgele = new Random();
        int kacinciKelime = rastgele.nextInt(gizliKelime.length+1);
        String tutulankelime = gizliKelime[kacinciKelime];
        int hak = tutulankelime.length();
        String altCizgi[] = new String[tutulankelime.length()];
        for (int i = 0; i < tutulankelime.length(); i++) {
            altCizgi[i] = "- ";
            System.out.println(altCizgi[i]);
        }
        while (hak>0) {
            System.out.println("Bir harf giriniz:");
            harf=inp.next();
            for (int i = 0; i < tutulankelime.length(); i++) {
                if (tutulankelime.charAt(i) == harf.charAt(0)) {
                    altCizgi[i] = harf.charAt(0) + " " ;
                    hak++;
                    dogru++;
                }
            }
            System.out.println(altCizgi);
        }
    }
}
