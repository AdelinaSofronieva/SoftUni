package F03Arrays.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P04LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int maxLength = 0;
        int length = 1;

        int minNum = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] < minNum) {
                minNum = numArr[i];
                index = i;
            }

            String collectIncreasingSubsecuense = minNum + "";
            //1 2 5 3 5 2 4 1
            for (int j = index + 1; j < numArr.length; j++) {
                if (numArr[j] > numArr[j - 1]) {
                    collectIncreasingSubsecuense = " " + numArr[j];
                }
            }


        }
    }
}
