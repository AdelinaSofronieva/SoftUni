package J02MultidimensionalArrays.Lab;

import java.util.Scanner;

public class P01CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matrixRows = scanner.nextInt();
        int matrixColumns = scanner.nextInt();

        int[][] firstMatrix = new int[matrixRows][matrixColumns];

        for (int rows = 0; rows < matrixRows; rows++) {
            for (int columns = 0; columns < matrixColumns; columns++) {
                int currentNumber = scanner.nextInt();
                firstMatrix[rows][columns] = currentNumber;
            }
        }

        matrixRows = scanner.nextInt();
        matrixColumns = scanner.nextInt();

        int[][] secondMatrix = new int[matrixRows][matrixColumns];

        for (int rows = 0; rows < matrixRows; rows++) {
            for (int columns = 0; columns < matrixColumns; columns++) {
                int currentNumber = scanner.nextInt();
                secondMatrix[rows][columns] = currentNumber;
            }
        }

        areEqualMatrices(firstMatrix, secondMatrix);

        System.out.println(areEqualMatrices(firstMatrix, secondMatrix) ? "equal" : "not equal");
    }

    private static boolean areEqualMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        boolean areMatrecesEqual = true;

        if (firstMatrix.length != secondMatrix.length) {
            return false;
        }

        for (int r = 0; r < firstMatrix.length; r++) {
            int firstMatrixRowsLength = firstMatrix[r].length;
            int secondMatrixRowsLength = secondMatrix[r].length;

            if (firstMatrixRowsLength != secondMatrixRowsLength) {
                return false;
            }

            for (int c = 0; c < firstMatrix[r].length; c++) {
                if (firstMatrix[r][c] != secondMatrix[r][c]) {
                    return false;
                }
            }
        }
        return true;
    }
}
