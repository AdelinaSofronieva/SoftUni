package F03Arrays.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P05KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String inputSubsicuence = scanner.nextLine();

        int lenght = 1;
        int bestSequenceIndex = 0;
        int bestSequenceSum = 0;
        int[] resultArr = new int[n];


        int maxLenght = 0;


        while (!inputSubsicuence.equals("Clone them!")) {
            int[] numArr = Arrays
                    .stream(inputSubsicuence.split("!"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for (int i = 1; i < numArr.length; i++) {
                if (numArr[i] == 1) {
                    lenght++;
                    bestSequenceIndex = i;
                }
                else {
                    lenght = 1;
                }

                if (lenght > bestSequenceSum) {
                    bestSequenceSum = lenght;
                }
            }



            inputSubsicuence = scanner.nextLine();
        }

        System.out.printf("Best DNA sample %d with sum: %d.",bestSequenceIndex, bestSequenceSum);
    }
}
