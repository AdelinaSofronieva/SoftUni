package J02MultidimensionalArrays.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rotateInput = scanner.nextLine().split("[()]");
        int rotateDegrees = Integer.parseInt(rotateInput[1]);
        String inputLine = scanner.nextLine();

        List<String> wordsList = new ArrayList<>();

        int maxWordLength = Integer.MIN_VALUE;
        while (!inputLine.equals("END")) {
            wordsList.add(inputLine);

            int currentWordLength = inputLine.length();
            if (currentWordLength > maxWordLength) {
                maxWordLength = currentWordLength;
            }

            inputLine = scanner.nextLine();
        }
        int rows = wordsList.size();
        int cols = maxWordLength;

        char[][] matrix = new char[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            String currentWord = wordsList.get(row);
            for (int col = 0; col < matrix[row].length; col++) {
                if (col < currentWord.length()) {
                    char currentChar = currentWord.charAt(col);
                    matrix[row][col] = currentChar;
                } else {
                    matrix[row][col] = ' ';
                }
            }
        }

        int angleOfRotation = rotateDegrees % 360;
        switch (angleOfRotation) {
            case 0:
                for (char[] row : matrix) {
                    for (char currentChar : row) {
                        System.out.print(currentChar);
                    }
                    System.out.println();
                }
                break;
            case 90:
                for (int col = 0; col < cols; col++) {
                    for (int row = rows - 1; row >= 0; row--) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            case 180:
                for (int row = rows - 1; row >= 0; row--) {
                    for (int col = cols - 1; col >= 0; col--) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
            case 270:
                for (int col = cols - 1;col >= 0; col--) {
                    for (int row = 0; row <rows ; row++) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;
        }

        //System.out.println(angleOfRotation);
    }
}
