package J02MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P05MaximumSumFf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] matrixDimensions = Arrays.stream(scanner.nextLine().split(",\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int matrixRows = matrixDimensions[0];
        int matrixCols = matrixDimensions[1];

        int matrix[][] = new int[matrixRows][matrixCols];

        for (int r = 0; r < matrix.length; r++) {
            matrix[r] = Arrays.stream(scanner.nextLine().split(",\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int maxSum = Integer.MIN_VALUE;
        int [][] subMatrix2x2 = new int[2][2];

        for (int r = 0; r < matrix.length - 1; r++) {
            for (int c = 0; c < matrix[r].length - 1; c++) {
                int currentSum = 0;
                currentSum = matrix[r][c] + matrix[r][c + 1] +
                        matrix[r + 1][c] + matrix[r + 1][c + 1];

                if (currentSum > maxSum) {
                    maxSum = currentSum;

                    subMatrix2x2[0][0] = matrix[r][c];
                    subMatrix2x2[0][1] = matrix[r][c + 1];
                    subMatrix2x2[1][0] = matrix[r + 1][c];
                    subMatrix2x2[1][1] = matrix[r + 1][c + 1];
                }

            }
        }

        for (int[] rows : subMatrix2x2) {
            for (int currentNum : rows) {
                System.out.print(currentNum + " ");
            }
            System.out.println();
        }
        System.out.println(maxSum);
    }
}
