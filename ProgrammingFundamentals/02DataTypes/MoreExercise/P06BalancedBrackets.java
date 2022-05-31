package F02DataTypes.MoreEcercise;

import java.util.Scanner;

public class P06BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        char openningBrackets = '(';
        char closingBrackets = ')';
        boolean isBalanced = false;
        int countOpenBrackets = 0;
        int countClosedBrackets = 0;

        for (int i = 1; i <= num; i++) {

            String input = scanner.nextLine();
            if (input.charAt(0) == openningBrackets) {
                countOpenBrackets++;
            } else if (input.charAt(0) == (closingBrackets)) {
                countClosedBrackets++;

                if (countOpenBrackets - countClosedBrackets != 0) {
                    System.out.println("UNBALANCED");
                    return;
                }
            }
        }

        if (countOpenBrackets == countClosedBrackets) {
            isBalanced = true;
        }

        if (isBalanced) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }

    }
}
