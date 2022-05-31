package F02DataTypes.Lab;

import java.util.Scanner;

public class P10SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int currnetNum = i;
            int sum = 0;

            while (currnetNum > 0) {
                sum = sum + (currnetNum % 10);
                currnetNum = currnetNum / 10;
            }

            if (sum == 5 | sum == 7 || sum == 11) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }

        }
    }
}
