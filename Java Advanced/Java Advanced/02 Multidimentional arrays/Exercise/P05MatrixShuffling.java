package J02MultidimensionalArrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P05MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] matrixDimensions = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(matrixDimensions[0]);
        int cols = Integer.parseInt(matrixDimensions[1]);

        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");
        }

        String inputLine = scanner.nextLine();

        while (!inputLine.equals("END")) {
            String[] commandLine = inputLine.split("\\s+");
            String command = commandLine[0];

            if (commandLine.length != 5 || !command.equals("swap")) {
                System.out.println("Invalid input!");
            } else {
                int firstRowToSwap = Integer.parseInt(commandLine[1]);
                int firstColToSwap = Integer.parseInt(commandLine[2]);
                int secondRowToSwap = Integer.parseInt(commandLine[3]);
                int secondColToSwap = Integer.parseInt(commandLine[4]);

                if (!checkIsValidIndex(rows, firstRowToSwap)
                        || !checkIsValidIndex(cols, firstColToSwap)
                        || !checkIsValidIndex(rows, secondRowToSwap)
                        || !checkIsValidIndex(cols, secondColToSwap)) {
                    System.out.println("Invalid input!");
                } else {
                            String firstElementToSwap = matrix[firstRowToSwap][firstColToSwap];
                            String secondElementToSwap = matrix[secondRowToSwap][secondColToSwap];
                            matrix[firstRowToSwap][firstColToSwap] = secondElementToSwap;
                            matrix[secondRowToSwap][secondColToSwap] = firstElementToSwap;

                    for (String[] row : matrix) {
                        for (String currentElement : row) {
                            System.out.print(currentElement + " ");
                        }
                        System.out.println();
                    }
                }
            }


            inputLine = scanner.nextLine();
        }
    }

    private static boolean checkIsValidIndex(int index, int elementToSwap) {
        boolean isValidIndex = true;
        if (elementToSwap < 0 || elementToSwap > index) {
            isValidIndex = false;
        }
        return isValidIndex;
    }
}
