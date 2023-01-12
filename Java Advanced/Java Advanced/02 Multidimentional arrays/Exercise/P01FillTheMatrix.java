package J02MultidimensionalArrays.Exercise;

import java.util.Scanner;

public class P01FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(",\\s+");
        int matrixSize = Integer.parseInt(input[0]);
        String pattern = input[1];

        int[][] matrix = new int[matrixSize][matrixSize];

        if (pattern.equals("A")) {
            patternA(matrixSize, matrix);

        } else {
            patternB(matrix);
        }

        printMatrix(matrix);
    }

    private static void patternB(int[][] matrix) {
        int counter = 1;
        for (int col = 0; col < matrix.length; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < matrix[col].length; row++) {
                    matrix[row][col] = counter;
                    counter++;
                }
            } else {
                for (int row = matrix[col].length - 1; row >= 0; row--) {
                    matrix[row][col] = counter;
                    counter++;
                }
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int currentElement : row) {
                System.out.print(currentElement + " ");
            }
            System.out.println();
        }
    }

    private static void patternA(int matrixSize, int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (col == 0) {
                    matrix[row][col] = row + 1;
                } else {
                    matrix[row][col] = matrix[row][col - 1] + matrixSize;
                }
            }
        }
    }
}
