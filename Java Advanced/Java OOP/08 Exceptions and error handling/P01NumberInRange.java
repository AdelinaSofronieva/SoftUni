package J08ExceptionsAndErrorHandling;

import java.util.Scanner;

public class P01NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rangeArr = scanner.nextLine().split("\\s+");
        int startIndex = Integer.parseInt(rangeArr[0]);
        int endIndex = Integer.parseInt(rangeArr[1]);
        System.out.printf("Range: [%d...%d]%n", startIndex, endIndex);

        checkNum(scanner, startIndex, endIndex);
    }

    private static void checkNum(Scanner scanner, int startIndex, int endIndex) {
        String currentNumToParse = scanner.nextLine();

        while (true) {
            try {
                int currentNum = Integer.parseInt(currentNumToParse);

                if (currentNum >= startIndex && currentNum <= endIndex) {
                    System.out.printf("Valid number: %d%n", currentNum);
                    return;
                }
            } catch (NumberFormatException ex) {

            }

            System.out.printf("Invalid number: %s%n", currentNumToParse);

            currentNumToParse = scanner.nextLine();
        }
    }
}
