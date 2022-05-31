package F02DataTypes.Lab;

import java.util.Scanner;

public class P12RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        //int currentNum = 0;
        boolean isSpecial = false;
        for (int i = 1; i <= num; i++) {
            int total = 0;
            int currentNum = i;
            while (i > 0) {
                total += i % 10;
                i = i / 10;
            }
            isSpecial = (total == 5) || (total == 7) || (total == 11);
            if (isSpecial){
                System.out.printf("%d -> True%n", currentNum);
            } else {
                System.out.printf("%d -> False%n", currentNum);
            }

            i = currentNum;
        }

    }
}
