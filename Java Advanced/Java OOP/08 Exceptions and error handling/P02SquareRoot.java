package J08ExceptionsAndErrorHandling;

import java.util.Scanner;

public class P02SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String valueToParse = scanner.nextLine();

        try {
            int num = Integer.parseInt(valueToParse);
            if (num < 0) {
                throw new IllegalArgumentException("Invalid");
            }
            double numSquare = Math.sqrt(num);
            System.out.printf("%.2f%n", numSquare);

        } catch (NumberFormatException ex) {
            System.out.println("Invalid");

        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());

        } finally {
            System.out.println("Goodbye");
        }
    }
}
