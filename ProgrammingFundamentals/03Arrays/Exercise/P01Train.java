package F03Arrays.Exercise;

import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] numArray = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int peopleOnWagon = Integer.parseInt(scanner.nextLine());
            numArray[i] = peopleOnWagon;
            sum += peopleOnWagon;
        }

        for (int currentNum: numArray) {
            System.out.printf("%d ", currentNum);
        }

        System.out.println();
        System.out.println(sum);
    }
}
