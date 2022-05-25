package F01BasicSyntax.Exercise;

import java.util.Scanner;

public class P08TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int rows = 1; rows <= number; rows++) {
            for (int cows = 1; cows <= rows; cows++) {
                System.out.printf("%d ", rows);
            }
            System.out.println();
        }
    }
}
