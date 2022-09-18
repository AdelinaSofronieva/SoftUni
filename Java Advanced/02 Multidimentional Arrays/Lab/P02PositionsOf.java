package J02MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P02PositionsOf {
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

        int checkIfNumberIsPresentInMatrix = Integer.parseInt(scanner.nextLine());
        //boolean isNumPresentInMatrix = false;
        StringBuilder printDimensionsIfMatrixContainsNum = new StringBuilder();

        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix[rows].length; cols++) {
                int currentNum = matrix[rows][cols];

                if (currentNum == checkIfNumberIsPresentInMatrix) {
                    printDimensionsIfMatrixContainsNum.append(rows);
                    printDimensionsIfMatrixContainsNum.append(" ");
                    printDimensionsIfMatrixContainsNum.append(cols);
                    printDimensionsIfMatrixContainsNum.append(System.lineSeparator());
                    //isNumPresentInMatrix = true;
                    //System.out.printf("%d %d%n", rows, cols);
                }
            }
        }
        System.out.println(printDimensionsIfMatrixContainsNum.length() == 0? "not found" : printDimensionsIfMatrixContainsNum);
        //System.out.println(printDimensionsIfMatrixContainsNum.isEmpty()? "not found" : printDimensionsIfMatrixContainsNum);

//        if (!isNumPresentInMatrix) {
//            System.out.println("not found");
//        }
    }
}
