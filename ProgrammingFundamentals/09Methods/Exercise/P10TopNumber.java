package F04Methods.Exercise;

import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        printTopNumber(n);
    }

    public static void printTopNumber (int n) {

        for (int i = 1; i <= n; i++) {
            int countOddDigits = 0;
            int sum = 0;

            String NtoString = Integer.toString(i);
            int size = NtoString.length();
            for (int j = 0; j < size; j++) {
                char currentSymbol = NtoString.charAt(j);
                int currentNum = currentSymbol - '0';
                sum += currentNum;

                if (currentNum % 2 != 0) {
                    countOddDigits++;
                }
            }

            if (sum % 8 == 0 && countOddDigits > 0) {
                System.out.println(i);
            }
        }
    }
}
