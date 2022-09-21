package F04Methods.Lab;

import java.util.Scanner;

public class P03PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printTriangle(n);
    }

    public static void printTriangle (int n) {

        for (int i = 1; i <= n; i++) {
            printTriangleLine(i);
        }

        for (int i = n - 1; i >= 1; i--) {
            printTriangleLine(i);
        }
    }

    public static void printTriangleLine (int n) {
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d ", i);

        }
        System.out.println();
    }
}
