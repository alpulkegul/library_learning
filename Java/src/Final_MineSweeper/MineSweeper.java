package Final_MineSweeper;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper{
    private final Scanner inp = new Scanner(System.in);
    private final Random rand = new Random();
    private int row;
    private int col;
    private String[][] secretMap;
    private String[][] visibleMap;
    private int mineCount;
    private String userName;

    public void go() {
        System.out.println("Oyuna başlamadan önce sana nasıl hitap etmemizi istersin.");
        System.out.print("Kullanıcı Adı: ");
        userName = inp.next();
        System.out.println("Merhaba " + userName + ",");
        System.out.println("Mayın Tarlası oyununa hoş geldin.\n" +
                             "Öncelikle, parselin boyutu kaça kaç (örnek: 4x5)olmasını istersin?");
        System.out.print("Oluşacak parselin satır sayısı: ");
        row = inp.nextInt();
        System.out.print("Oluşacak parselin sütun sayısı: ");
        col = inp.nextInt();
        System.out.println("Tarlan hazırlanıyor.. Geri Sayım başlasın!");
        System.out.println("    " + 3);
        System.out.println("    " + 2);
        System.out.println("    " + 1);
        System.out.println("İşte hazır!");


        mineCount = (row * col) / 4;

        secretMap = new String[row][col];
        visibleMap = new String[row][col];

        for (int i = 0; i < secretMap.length; i++) {
            for (int j = 0; j < secretMap[i].length; j++) {
                secretMap[i][j] = "-";
                visibleMap[i][j] = "-";
            }
        }
        while (mineCount > 0) {
            int i = rand.nextInt(row);
            int j = rand.nextInt(col);
            if (secretMap[i][j].equals("-")) {
                secretMap[i][j] = "*";
                mineCount--;
            }
        }
        printMapVisible();

        play();

    }


    private void printMapVisible(){
        for (int i = 0; i < visibleMap.length; i++) {
            for (int j = 0; j < visibleMap[i].length; j++) {
                System.out.print(visibleMap[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void printMapSecret() {
        for (int i = 0; i < secretMap.length; i++) {
            for (int j = 0; j < secretMap[i].length; j++) {
                System.out.print(secretMap[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void play(){
        boolean finish = true;
        while (finish){
            System.out.print("Satır gir:");
            int slcRow = inp.nextInt();
            System.out.print("Sütun gir:");
            int slcCol = inp.nextInt();

            int n = 0;

            if (slcRow < row && slcCol < col) {
                if (secretMap[slcRow][slcCol].equals("-") && visibleMap[slcRow][slcCol].equals("-")) {
                    for (int i = slcRow - 1; i < slcRow; i++) {
                        for (int j = slcCol - 1; j < slcCol; i++) {
                            if (i >= 0 && j >= 0 && i < row && j < col && secretMap[i][j].equals("*")) {
                                n++;
                                visibleMap[slcRow][slcCol] = Integer.toString(n);
                            } else {
                                visibleMap[slcRow][slcCol] = Integer.toString(n);
                            }
                        }
                    }
                    printMapVisible();

                    if (!checkWin()) {
                        System.out.println("Tebrikler. Kazandın!");
                        printMapSecret();
                        finish = false;

                    }
                } else if (secretMap[slcRow][slcCol].equals("*")) {
                    System.out.println("Yazık oldu, mayına bastın :/");
                    printMapSecret();
                } else if (!visibleMap[slcRow][slcCol].equals("-")) {
                    System.out.println("Bu koordinat zaten seçildi. Başka koordinat seç.");
                }

            }else {
                System.out.println("Sınırını bil! Alan dışından seçim yaptın.");
            }



        }


    }

    private boolean checkWin() {
        int count = 0;
        int mineNumb = 0;
        for (int i = 0; i < visibleMap.length; i++) {
            for (int j = 0; j < visibleMap[i].length; j++) {
                if (visibleMap[i][j].equals("-")) {
                    count++;
                }
                if (secretMap[i][j].equals("*")) {
                    mineNumb++;
                }
            }
        }
        if (mineNumb == count) {
            return true;
        }
        return false;
    }

}

