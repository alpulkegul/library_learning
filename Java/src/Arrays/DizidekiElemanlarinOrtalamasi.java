//Project: Average of elements in array

package Arrays;

import java.util.Scanner;

import java.util.Scanner;
public class DizidekiElemanlarinOrtalamasi {

    public static double HarmonicAverage(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += 1 / arr[i];
        }
        return arr.length/sum;
    }
    public static void main(String[] args) {
        /*
        int[] array = {24, 56, 25, 54, 89, 67, 25, 15, 35};
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum / array.length);
        */

        Scanner inp = new Scanner(System.in);
        System.out.print("Dizi eleman sayısı gir: ");
        int n = inp.nextInt();

        double[] array = new double[n];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elemanını gir: ");
            array[i] = inp.nextInt();
        }

        double harmonicAvg = HarmonicAverage(array);

        System.out.print("Dizinin harmonik ortalaması: " + harmonicAvg);

    }


}
