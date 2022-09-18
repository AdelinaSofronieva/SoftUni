package J02MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P04SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(",\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int matrixRows = dimensions[0];
        int matrixCols = dimensions[1];

        int[][] matrix = new int[matrixRows][matrixCols];

        for (int r = 0; r < matrix.length; r++) {
            matrix[r] = Arrays.stream(scanner.nextLine().split(",\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int sum = 0;

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                int currentNum = matrix[r][c];
                sum += currentNum;
            }
        }

        System.out.println(matrixRows);
        System.out.println(matrixCols);
        System.out.println(sum);
    }
}
