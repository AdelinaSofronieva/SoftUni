package J02MultidimensionalArrays.Exercise;

import java.util.Scanner;

public class P08TheHeiganDance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double damageForEachTurn = Double.parseDouble(scanner.nextLine());

        String[] spellsInput = scanner.nextLine().split("\\s+");
        String spell = spellsInput[0];
        int spellRow = Integer.parseInt(spellsInput[1]);
        int spellCol = Integer.parseInt(spellsInput[2]);

        int[][] matrix = new int[15][15];

        int counter = 1;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = counter;
                counter++;
            }
        }

        System.out.println();
    }
}
