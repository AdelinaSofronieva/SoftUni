package F01BasicSyntax.MoreExercise;

import java.util.Scanner;

public class P05Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNums = Integer.parseInt(scanner.nextLine());
        String text = "";

        for (int i = 1; i <= countNums; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            int numberOfdigits = String.valueOf(currentNum).length();
            int mainDigit = currentNum % 10;
            int offset = (mainDigit - 2) * 3;

            if (mainDigit == 8 || mainDigit == 9) {
                offset += 1;
            }

            int letterIndex = (offset + numberOfdigits - 1);
            int currenntDigit = letterIndex + 97;

            if (currenntDigit < 97) {
                currenntDigit = 32;
            }

            char currentSymbol = (char) currenntDigit;
            text += currentSymbol;

        }
        System.out.print(text);
    }
}
