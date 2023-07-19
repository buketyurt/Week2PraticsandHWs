package org.example.Transpose;

import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        // Example matrix sizes
        int rows = 2;
        int cols = 3;

        // Example Matrix
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // New matrix for finding its transpose
        int[][] transposedMatrix = new int[cols][rows];

        // Matrisin transpozunu bulma işlemi
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        // Printing matrix
        System.out.println("Orjinal Matris:");
        printMatrix(matrix);

        System.out.println("\nTranspoze Matris:");
        printMatrix(transposedMatrix);
    }

    // Print supporter
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

}
