package F03Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rotations = Integer.parseInt(scanner.nextLine());

        for (int countRotations = 1; countRotations <= rotations; countRotations++) {
            int firstElement = numArr[0];

            for (int i = 0; i < numArr.length - 1; i++) {
                numArr[i] = numArr[i + 1];
            }

            numArr[numArr.length - 1] = firstElement;

        }

        for (int currentNum : numArr) {
            System.out.printf("%d ", currentNum);
        }
    }
}
