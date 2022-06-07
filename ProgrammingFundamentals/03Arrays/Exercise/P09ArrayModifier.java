package F03Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P09ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] currentLine = command.split(" ");
            String currentCommand = currentLine[0];

            switch (currentCommand) {
                case "swap":
                    int firstIndex = Integer.parseInt(currentLine[1]);
                    int secondIndex = Integer.parseInt(currentLine[2]);
                    int firstIndexToChange = numArr[firstIndex];
                    int secondIndexToChange = numArr[secondIndex];

                    numArr[firstIndex] = secondIndexToChange;
                    numArr[secondIndex] = firstIndexToChange;
                    break;
                case "multiply":

                    int multiplyFirstIndex = Integer.parseInt(currentLine[1]);
                    int multiplySecondIndex = Integer.parseInt(currentLine[2]);
                    int multiplyFirstIndexToChange = numArr[multiplyFirstIndex];
                    int multiplySecondIndexToChange = numArr[multiplySecondIndex];
                    int product = multiplyFirstIndexToChange * multiplySecondIndexToChange;
                    numArr[multiplyFirstIndex] = product;
                    break;
                case "decrease":
                    for (int i = 0; i <numArr.length; i++) {
                        numArr[i] -= 1;

                    }
                    break;
            }

            command = scanner.nextLine();
        }

        for (int i = 0; i < numArr.length; i++) {
            if (i != numArr.length - 1) {
                System.out.printf("%d, ", numArr[i]);
            } else {
                System.out.printf("%d", numArr[i]);
            }

        }

    }
}
