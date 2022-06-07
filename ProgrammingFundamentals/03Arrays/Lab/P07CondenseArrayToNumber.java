package F03Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P07CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] condensed = new int[numArr.length -1];

        int sum = 0;
        int countElements = numArr.length - 1;
        int countNumArray = 0;

        while (countElements > 1) {
            for (int i = 0; i < numArr.length - 1 - countNumArray; i++) {
                condensed[i]  = numArr[i] + numArr[i+1];
                numArr[i] = condensed[i];

            }
            countElements--;
            countNumArray ++;
        }



        if (numArr.length > 1) {
            sum = condensed[0] + condensed[1];
            System.out.println(sum);
        }
        else {
            System.out.print(numArr[0]);
        }

    }
}
