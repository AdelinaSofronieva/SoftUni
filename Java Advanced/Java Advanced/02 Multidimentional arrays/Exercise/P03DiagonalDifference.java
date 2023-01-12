package J02MultidimensionalArrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P03DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matrixSize = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[matrixSize][matrixSize];

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

        }

        int primaryDiagonalSum = 0;

        for (int row = 0; row < matrix.length; row++) {
            primaryDiagonalSum += matrix[row][row];
        }

        int secondaryDiagonalSum = 0;

//        for (int row = matrix.length - 1, col = 0; row >= 0 && col < matrix.length; row--, col++) {
//                secondaryDiagonalSum += matrix[row][col];
//        }

        for (int row = matrix.length - 1; row >= 0 ; row--) {
            secondaryDiagonalSum += matrix[row][matrixSize - row - 1];
        }

        int difference = Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
        System.out.println(difference);
    }
}
