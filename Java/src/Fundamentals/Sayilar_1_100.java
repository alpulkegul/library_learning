package Fundamentals;

public class Sayilar_1_100 {
    public static void main(String[] args) {
        int i = 1;
        int toplam = 0;
        for (; i <= 100; i++) {
            toplam += i;

        }
        System.out.println("Toplam: " + toplam);
    }
}
