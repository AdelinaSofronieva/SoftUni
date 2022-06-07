package F03Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numRows = Integer.parseInt(scanner.nextLine());

        int[] firstArray = new int[numRows];
        int[] secondArray = new int[numRows];

        for (int i = 1; i <= numRows; i++) {
            int[] numArr = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            if (i % 2 != 0) {
                firstArray[i-1] = numArr[0];
                secondArray[i-1] = numArr[1];
            } else {
                firstArray[i-1] = numArr[1];
                secondArray[i-1] = numArr[0];
            }

        }

        for (int currentNum: firstArray) {
            System.out.printf("%d ", currentNum);
        }

        System.out.println();

        for (int currentNum: secondArray) {
            System.out.printf("%d ", currentNum);
        }
    }
}
