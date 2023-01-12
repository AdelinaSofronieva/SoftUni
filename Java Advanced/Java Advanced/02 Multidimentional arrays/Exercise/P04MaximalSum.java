package J02MultidimensionalArrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P04MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] matrixDimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int matrixRows = matrixDimensions[0];
        int matrixCols = matrixDimensions[1];

        int[][] matrix = new int[matrixRows][matrixCols];

        for (int rows = 0; rows < matrix.length; rows++) {
            matrix[rows] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int maxSum = Integer.MIN_VALUE;
        int startRowIndex = 0;
        int startColIndex = 0;

        for (int row = 0; row < matrix.length - 2; row++) {
            for (int col = 0; col < matrix[row].length - 2; col++) {
                int sum = 0;

                for (int subRow = row; subRow < row + 3; subRow++) {
                    for (int subCol = col; subCol < col + 3; subCol++) {
                        sum += matrix[subRow][subCol];
                    }
                }
//                sum = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2]
//                        + matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2]
//                        + matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];

                if (sum > maxSum) {
                    maxSum = sum;
                    startRowIndex = row;
                    startColIndex = col;
                }
            }
        }

        System.out.println("Sum = " + maxSum);
        for (int row = startRowIndex; row < startRowIndex + 3; row++) {
            for (int col = startColIndex; col < startColIndex + 3; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
//        System.out.println(startRowIndex);
//        System.out.println(startColIndex);
    }
}
