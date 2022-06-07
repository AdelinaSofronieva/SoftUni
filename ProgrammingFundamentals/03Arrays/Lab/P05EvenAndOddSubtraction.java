package F03Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P05EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        int[] numArr = Arrays
                .stream(inputLine.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int oddSum = 0;
        int evenSum = 0;
        for (int currentNum: numArr) {
            if (currentNum % 2 == 0) {
                evenSum += currentNum;
            } else {
                oddSum += currentNum;
            }
        }

        int difference = evenSum - oddSum;
        System.out.println(difference);


    }
}
