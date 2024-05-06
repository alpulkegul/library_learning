package Arrays;

import java.util.*;
public class Frequency {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(arr);
        int tryNumb = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                tryNumb++;
            } else {
                System.out.println(arr[i]+" sayısı " + tryNumb + " kere tekrar edildi.");
                tryNumb = 1;
            }
        }
        System.out.println(arr[arr.length - 1] + " sayısı " + tryNumb + " kere tekrar edildi.");
    }
}
