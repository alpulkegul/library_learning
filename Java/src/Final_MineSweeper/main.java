package Final_MineSweeper;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int row, col;
        System.out.println("Welcome to Mine Sweeper!");
        System.out.println("Enter the sizes you want to play with ↓\n");
        System.out.print("Number of rows: ");
        row = inp.nextInt();
        System.out.print("Number of columns: ");
        col = inp.nextInt();
        MineSweeper mine = new MineSweeper(row, col);
        mine.run();
    }

}
