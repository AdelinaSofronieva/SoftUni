package J02MultidimensionalArrays.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P07Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];

        List<List<Integer>> matrix = new ArrayList<>();

        int count = 1;

        for (int row = 0; row < rows; row++) {
            matrix.add(new ArrayList<>());
            for (int col = 0; col < cols; col++) {
                matrix.get(row).add(count++);
            }
        }

        String input = scanner.nextLine();

        while (!input.equals("Nuke it from orbit")) {
            int commandRow = Integer.parseInt(input.split("\\s+")[0]);
            int commandCol = Integer.parseInt(input.split("\\s+")[1]);
            int radius = Integer.parseInt(input.split("\\s+")[2]);

            //remove top elements
            int top = commandRow - radius;
            if (top < 0) {
                top = 0;
            }

            for (int r = commandRow; r >= top; r--) {
                if (matrix.get(r).size() >= commandCol) {
                    matrix.get(r).remove(commandCol);
                }
            }

            //remove bottom elements
            int bottom = commandRow + radius;
            if (bottom > matrix.size()) {
                bottom = matrix.size() - 1;
            }
            for (int r = commandRow + 1; r < bottom; r++) {
                if (matrix.get(r).size() >= commandCol) {
                    matrix.get(r).remove(commandCol);
                }
            }

            //remove left elements
            int left = commandCol - radius;
            if (left < 0) {
                left = 0;
            }

            for (int c = left ; c < commandCol; c++) {
                    matrix.get(commandRow).remove(c);
                    commandCol--;
                    c--;
            }

            //remove right elements
            int right = commandCol + radius;

            if (right > matrix.get(commandRow).size() - 1) {
                right = matrix.get(commandRow).size() ;
            }

            //int lastElement = matrix.get(commandRow).size() - 1;
            for (int c = commandCol ; c < right; c++) {
                matrix.get(commandRow).remove(c);
                right--;
                c--;
            }


            input = scanner.nextLine();
        }


        for (List<Integer> matrixRows : matrix) {
            for (Integer currentElement : matrixRows) {
                System.out.print(currentElement + " ");
            }
            System.out.println();
        }

    }
}