package J02MultidimensionalArrays.Exercise;

import java.util.Scanner;

public class P02MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] matrixDimensions = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(matrixDimensions[0]);
        int cols = Integer.parseInt(matrixDimensions[1]);

        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                char outerSymbol = (char) ('a' + row);
                char innerSymbol = (char) ('a' + row + col);
                matrix[row][col] = String.valueOf(outerSymbol) + innerSymbol + outerSymbol;
            }
        }

        for (String[] row : matrix) {
            for (String currentElement : row) {
                System.out.print(currentElement + " ");
            }
            System.out.println();
        }
    }
}
