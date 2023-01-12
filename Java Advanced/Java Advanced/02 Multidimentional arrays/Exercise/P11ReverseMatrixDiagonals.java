package J02MultidimensionalArrays.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class P11ReverseMatrixDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().trim().split("\\s+");
        final int rows = Integer.parseInt(dimensions[0]);
        final int cols = Integer.parseInt(dimensions[1]);

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().trim().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }

        Map<Integer, List<Integer>> diagonals = new LinkedHashMap<>();
        for (int group = 0, diagonal = 0, row = rows - 1; row >= 0; row--, diagonal = ++group) {
            for (int col = cols - 1; col >= 0 && col >= group; col--, diagonal++) {
                addValueToDiagonal(diagonals, matrix[row][col], diagonal);
            }

            for (int r = rows - 1 - 1 - group; r >= 0 && group < cols; r--, diagonal++) {
                addValueToDiagonal(diagonals, matrix[r][group], diagonal);
            }
        }

        final StringBuilder sb = new StringBuilder();

        diagonals.values().forEach(numbers -> sb
                .append(numbers.stream().map(Object::toString).collect(Collectors.joining(" ")))
                .append(System.lineSeparator()));

        System.out.print(sb);
    }

    private static void addValueToDiagonal(Map<Integer, List<Integer>> diagonals, int value, int diagonal) {
        diagonals.putIfAbsent(diagonal, new ArrayList<>());
        diagonals.get(diagonal).add(value);
    }
}