package J02MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P03IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mForMatrixRows = Integer.parseInt(scanner.nextLine());
        int nForMatrixCols = Integer.parseInt(scanner.nextLine());

        String[][] matrixA = new String[mForMatrixRows][nForMatrixCols];
        String[][] matrixB = new String[mForMatrixRows][nForMatrixCols];
        String[][] matrixC = new String[mForMatrixRows][nForMatrixCols];

        readMatrix(scanner, mForMatrixRows, matrixA);
        readMatrix(scanner, mForMatrixRows, matrixB);

        for (int r = 0; r < matrixC.length; r++) {
            for (int c = 0; c <matrixC[r].length ; c++) {
                String matrixAelement = matrixA[r][c];
                String matrixBelement = matrixB[r][c];

                if (matrixAelement.equals(matrixBelement)) {
                    matrixC[r][c] = matrixAelement;
                } else {
                    matrixC[r][c] = "*";
                }


            }
        }

        for (String[] rows : matrixC) {
            for (String currentElement : rows) {
                System.out.print(currentElement +  " ");
            }
            System.out.println();
        }
    }

    private static String[][] readMatrix(Scanner scanner, int mForMatrixRows, String[][] matrix) {
        for (int r = 0; r < mForMatrixRows; r++) {
            matrix[r] = scanner.nextLine().split("\\s+");

        }
        return matrix;
    }
}

