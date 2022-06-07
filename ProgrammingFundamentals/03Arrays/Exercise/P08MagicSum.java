package F03Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int magicNum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numArr.length - 1 ; i++) {
            for (int j = i + 1; j < numArr.length; j++) {
                if (numArr[i] + numArr[j] == magicNum) {
                    System.out.printf("%d %d%n", numArr[i], numArr[j]);
                }
            }

        }

    }
}
