//Project: Max-Min_Array

package Arrays;

import java.util.*;
public class ArrayMaxMinElements {
    private static void minMaxList() {
        int[] list = {56,34,1,8,101,-2,-33};

        int min = list[0];
        int max = list[0];
        for (int i: list){
            if (i < min) {
                min = i;
            } else if (i > max) {
                max = i;
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
    private static void NearestNumber(){
        int[] array = {15, 12, 788, 2, 0};
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = inp.nextInt();
        Arrays.sort(array);
        System.out.print("Array: " + Arrays.toString(array));
        System.out.println("Select number: " + a);

        int sn = 0;
        int ln = 0;

        for (int i : array) {
            if (i < a) {
                sn = i;
            }
        }
        for (int k : array) {
            if (k > a) {
                ln = k;
                break;
            }
        }
    }

    public static void main(String[] args) {

        //minMaxList();

        /*int[] array = {15, 12, 788, 2, 0};
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = inp.nextInt();
        Arrays.sort(array);
        System.out.println("Dizi: " + Arrays.toString(array));
        System.out.println("Girilen sayı: " + a);
        int sn = 0;
        int ln = 0;
        for (int i : array) {
            if (i < a) {
                sn = i;
            }
        }
        for (int k : array) {
            if (k > a) {
                ln = k;
                break;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + sn);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + ln);

    */

    }

}
