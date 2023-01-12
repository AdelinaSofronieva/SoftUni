package J02MultidimensionalArrays.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P06PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matrixSize = Integer.parseInt(scanner.nextLine());

        int [][] matrix = new int[matrixSize][matrixSize];

        for (int r = 0; r < matrix.length; r++) {
            matrix[r] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        List<Integer> firstDiagonal = new ArrayList<>();
        List<Integer> secondDiagonal =  new ArrayList<>();


        int row = 0;
        int col = 0;

        while (row < matrix.length && col < matrix.length) {
            int currentDiagonalNum = matrix[row][col];
            firstDiagonal.add(currentDiagonalNum);
            row++;
            col++;
        }

         row = matrix.length - 1;
         col = 0;

         while (row >= 0 && col < matrix.length){
             int currentDiagonalNum = matrix[row][col];
             secondDiagonal.add(currentDiagonalNum);
             row--;
             col++;

         }

        System.out.println(firstDiagonal.toString().replaceAll("[\\[\\],]", ""));
        System.out.println(secondDiagonal.toString().replaceAll("[\\[\\],]", ""));
    }
}
