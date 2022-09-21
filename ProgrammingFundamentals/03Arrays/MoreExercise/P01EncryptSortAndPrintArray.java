package F03Arrays.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P01EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] convertedNames = new int[n];

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();

            int sum = 0;
            for (int currentLetter = 0; currentLetter < name.length(); currentLetter++) {
                char letter = name.charAt(currentLetter);

                if(letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u' ||
                        letter=='A' || letter=='E' || letter=='I' || letter=='O' || letter=='U') {
                    sum += letter * name.length();
                }else {
                    sum += letter / name.length();
                }

            }
            convertedNames[i] = sum;

        }

        Arrays.sort(convertedNames);

        for (int element:
                convertedNames) {
            System.out.println(element);
        }

    }
}
