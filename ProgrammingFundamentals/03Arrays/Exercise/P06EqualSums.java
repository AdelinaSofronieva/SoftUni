package F03Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isEqual = false;
        int index = 0;

        for (int i = 0; i < numArr.length; i++) {
            int currentNum = numArr[i];

            int leftSum = 0;
            int rightSum = 0;

            for (int elementBeforeCurrentNum = 0; elementBeforeCurrentNum < i; elementBeforeCurrentNum++) {
                leftSum += numArr[elementBeforeCurrentNum];
            }

            for (int elementAfterCurrentNum = i + 1; elementAfterCurrentNum < numArr.length; elementAfterCurrentNum++) {
                rightSum += numArr[elementAfterCurrentNum];
            }

            if (leftSum == rightSum) {
                isEqual =true;
                index = i;
            }

        }

        if (isEqual) {
            System.out.println(index);
        } else {
            System.out.println("no");
        }
    }
}
