package J02MultidimensionalArrays.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P08WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matrixSize = Integer.parseInt(scanner.nextLine());

        int [][] matrix = new int[matrixSize][matrixSize];

        for (int r = 0; r < matrix.length; r++) {
            matrix[r] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int[] numIndexes = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int numToReplace = matrix[numIndexes[0]][numIndexes[1]];
        List<int[]> correctValues = new ArrayList<>();

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                int currentNum =matrix[r][c];

                if (currentNum == numToReplace) {
                    int upNum = 0;
                    int downNum = 0;
                    int leftNum = 0;
                    int rightNum = 0;

                    if (isValidIndex(matrix, r - 1, c)) {
                        upNum = matrix[r - 1][c];
                        if (upNum == numToReplace) {
                            upNum = 0;
                        }
                    }

                    if (isValidIndex(matrix, r + 1, c)) {
                        downNum = matrix[r + 1][c];
                        if (downNum == numToReplace) {
                            downNum = 0;
                        }
                    }

                    if (isValidIndex(matrix, r, c - 1)) {
                        leftNum = matrix[r][c - 1];
                        if (leftNum == numToReplace) {
                            leftNum = 0;
                        }
                    }

                    if (isValidIndex(matrix, r, c + 1)) {
                        rightNum = matrix[r][c + 1];
                        if (rightNum == numToReplace) {
                            rightNum = 0;
                        }
                    }

                    int correctValue = upNum + downNum + leftNum + rightNum;
                    correctValues.add(new int[] {r, c, correctValue});
                }
            }
        }

        for (int[] correctValue : correctValues) {
            int row = correctValue[0];
            int col = correctValue[1];
            matrix[row][col] = correctValue[2];
        }

        for (int[] arr : matrix) {
            for (int n : arr) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

    private static boolean isValidIndex (int[][] matrix, int r, int c) {
        return r >= 0 && r < matrix.length && c >= 0 && c < matrix[r].length;

    }
}
