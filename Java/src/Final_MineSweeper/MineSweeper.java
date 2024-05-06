package Final_MineSweeper;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumb, colNumb, size;
    int[][] map, board;
    boolean isGame = true;
    Random rnd = new Random();
    Scanner inp = new Scanner(System.in);

    MineSweeper(int rowNumb, int colNumb) {
        this.rowNumb = rowNumb;
        this.colNumb = colNumb;
        this.map = new int[rowNumb][colNumb];
        this.board = new int[rowNumb][colNumb];
        this.size = rowNumb*colNumb;
    }

    public void run() {
        int row, col, success=0;
        prepareGame();
        print(map);
        System.out.println("Game is On!");
        while (isGame) {
            print(board);
            System.out.print("Row: ");
            row = inp.nextInt();
            System.out.print("Column: ");
            col = inp.nextInt();
            if (row < 2 && col < 2) {
                System.out.println("You have to enter at least 2x2");
            }

            if (row < 0 || row >= rowNumb) {

                System.out.println("Coordinate error!");
                continue;
            }
            if (col < 0 || col >= colNumb) {
                System.out.println("Coordinate error!");
                continue;
            }
            if (map[row][col] != -1) {
                check(row, col);
                success++;
                if (success == (size - (size / 4))) {
                    System.out.println("Win! ");
                    break;
                }
            } else {
                isGame= false;
                System.out.println("Game Over!");
            }
        }

    }

    public void check(int r, int c) {
        if (board[r][c] == 0) {
            if ((c < colNumb - 1) && (map[r][c + 1] == -1)) {
                board[r][c]++;

            }
            if ((r < rowNumb - 1) && (map[r + 1][c] == -1)) {
                board[r][c]++;

            }
            if ((r > 0) && (map[r - 1][c] == -1)) {
                board[r][c]++;
            }
            if ((c > 0) && (map[r][c - 1] == -1)) {
                board[r][c]++;
            }
            if (board[r][c] == 0) {
                board[r][c] = -2;
            }
        }

    }
    public void prepareGame() {
        int randRow, randCol, count = 0;
        while(count != (size/4)) {
            randRow = rnd.nextInt(rowNumb);
            randCol = rnd.nextInt(colNumb);
            if (map[randRow][randCol] != -1) {
                map[randRow][randCol] = -1;
                count++;
            }
        }

    }



    public void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] >= 0 ) {
                    System.out.print(" ");
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

