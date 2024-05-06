package Fundamentals_plus;
import java.util.*;
public class SayiTahminOyunu {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        //int number = (int) (Math.random() * 100);
        Scanner inp = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;
        System.out.println(number);
        while (right < 5) {
            System.out.println("Tahmininiz: ");
            selected = inp.nextInt();
            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 1-100 arasında bir sayı giriniz.");
                if (isWrong) {
                    System.out.println("Çok fazla hatalı giriş yaptınız." + (5 - (++right)));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;

            }
            if (selected == number) {
                System.out.println("Tebrikler. Bildiniz!");
                System.out.println("Tahmininiz:" + selected);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı bir sayı girdiniz.");
                if (selected > number) {
                    System.out.println(selected + " sayısı gizli sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " sayısı gizli sayıdan küçüktür.");
                }
                wrong [right++] = selected;
                System.out.println("Kalan hak: " + (5 - right));


            }
        }
        if (!isWin) {
            System.out.println("Kaybettiniz.");
            if (!isWrong) {
                System.out.println("Tahminleriniz: " + Arrays.toString(wrong));
            }
        }
    }




}
