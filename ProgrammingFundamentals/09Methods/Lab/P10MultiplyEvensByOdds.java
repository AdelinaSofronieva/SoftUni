package F04Methods.Lab;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class P10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(getMultipleOfEvensAndOdds(n));
    }

    public static int getMultipleOfEvensAndOdds(int n) {
        int result = 0;
        String convertNtoString = Integer.toString(n);
        int sumEvenDigits = 0;
        int sumOddDigits = 0;

        for (int i = 0; i < convertNtoString.length(); i++) {
            char currentChar = convertNtoString.charAt(i);
            if (currentChar != '-') {
                int currentNum = Integer.parseInt(String.valueOf(currentChar));
                if (currentNum % 2 == 0) {
                    sumEvenDigits += currentNum;
                } else {
                    sumOddDigits += currentNum;
                }
            }
                result = sumEvenDigits * sumOddDigits;

        }
        return result;
    }
}