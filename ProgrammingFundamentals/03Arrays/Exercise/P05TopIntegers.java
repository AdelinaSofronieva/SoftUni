package F03Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        for (int i = 0; i < numArr.length; i++) {
            int currentNum = numArr[i];
            boolean isBigger = false;

            if (i == numArr.length - 1) {
                System.out.print(currentNum + " ");
                break;
            }

            for (int j = i + 1; j < numArr.length; j++) {
                if (currentNum > numArr[j]) {
                    isBigger = true;
                } else {
                    isBigger = false;
                    break;
                }
            }
            if (isBigger) {
                System.out.printf("%d ", currentNum);
            }

        }

    }
}
