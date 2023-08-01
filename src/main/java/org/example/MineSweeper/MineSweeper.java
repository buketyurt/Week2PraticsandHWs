package org.example.MineSweeper;

import java.util.Scanner;
import java.util.Scanner;
public class MineSweeper {



        private int rowSize;
        private int colSize;
        private int[][] mineField;
        private boolean[][] revealed;
        private int totalMines;

        public MineSweeper(int rowSize, int colSize) {
            this.rowSize = rowSize;
            this.colSize = colSize;
            mineField = new int[rowSize][colSize];
            revealed = new boolean[rowSize][colSize];
            totalMines = (rowSize * colSize) / 4; // 1/4 of total cells will be mines
            placeMines();
        }

        private void placeMines() {
            // Initialize the mineField and revealed arrays with 0's and false respectively
            for (int i = 0; i < rowSize; i++) {
                for (int j = 0; j < colSize; j++) {
                    mineField[i][j] = 0;
                    revealed[i][j] = false;
                }
            }

            // Randomly place mines on the mineField
            int minesPlaced = 0;
            while (minesPlaced < totalMines) {
                int randomRow = (int) (Math.random() * rowSize);
                int randomCol = (int) (Math.random() * colSize);
                if (mineField[randomRow][randomCol] != -1) {
                    mineField[randomRow][randomCol] = -1; // -1 represents a mine
                    minesPlaced++;
                }
            }
        }

        private boolean isValidCell(int row, int col) {
            return row >= 0 && row < rowSize && col >= 0 && col < colSize;
        }

        private int countAdjacentMines(int row, int col) {
            int count = 0;
            for (int i = row - 1; i <= row + 1; i++) {
                for (int j = col - 1; j <= col + 1; j++) {
                    if (isValidCell(i, j) && mineField[i][j] == -1) {
                        count++;
                    }
                }
            }
            return count;
        }

        private void revealCell(int row, int col) {
            if (isValidCell(row, col) && !revealed[row][col]) {
                revealed[row][col] = true;
                if (mineField[row][col] == 0) {
                    for (int i = row - 1; i <= row + 1; i++) {
                        for (int j = col - 1; j <= col + 1; j++) {
                            revealCell(i, j);
                        }
                    }
                }
            }
        }

        public void play() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz!");
            while (true) {
                // Print the current mineField
                for (int i = 0; i < rowSize; i++) {
                    for (int j = 0; j < colSize; j++) {
                        if (revealed[i][j]) {
                            if (mineField[i][j] == -1) {
                                System.out.print("* ");
                            } else {
                                System.out.print(mineField[i][j] + " ");
                            }
                        } else {
                            System.out.print("- ");
                        }
                    }
                    System.out.println();
                }

                // Ask user for row and column input
                System.out.print("Satır Giriniz: ");
                int row = scanner.nextInt();
                System.out.print("Sütun Giriniz: ");
                int col = scanner.nextInt();

                // Check if the input cell is valid
                if (!isValidCell(row, col)) {
                    System.out.println("Geçersiz bir hücre seçtiniz. Lütfen tekrar deneyin.");
                    continue;
                }

                // Check if the user hit a mine
                if (mineField[row][col] == -1) {
                    System.out.println("Game Over!!");
                    break;
                }

                // Reveal the cell and its adjacent cells
                revealCell(row, col);

                // Check if the user has won
                int revealedCells = 0;
                for (int i = 0; i < rowSize; i++) {
                    for (int j = 0; j < colSize; j++) {
                        if (revealed[i][j]) {
                            revealedCells++;
                        }
                    }
                }
                if (revealedCells == rowSize * colSize - totalMines) {
                    System.out.println("Oyunu Kazandınız!");
                    break;
                }
            }
        }

        public static void main(String[] args) {
            int rowSize = 3;
            int colSize = 3;
            MineSweeper mineSweeper = new MineSweeper(rowSize, colSize);
            mineSweeper.play();
        }
    }


