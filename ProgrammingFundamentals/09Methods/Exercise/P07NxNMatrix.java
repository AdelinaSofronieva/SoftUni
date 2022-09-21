package F04Methods.Exercise;

import java.util.Scanner;

public class P07NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printNxNMatrix(n);
    }

    public static void printNxNMatrix (int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int cows = 1; cows <= n; cows++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
