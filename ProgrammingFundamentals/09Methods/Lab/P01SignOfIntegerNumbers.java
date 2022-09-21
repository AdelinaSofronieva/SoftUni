package F04Methods.Lab;

import java.util.Scanner;

public class P01SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printSignOfIntegerNum(n);
    }

    public static void printSignOfIntegerNum (int n) {
        if (n > 0) {
            System.out.printf("The number %d is positive.", n);
        } else if (n < 0) {
            System.out.printf("The number %d is negative.", n);
        } else {
            System.out.printf("The number 0 is zero.");
        }
    }
}
