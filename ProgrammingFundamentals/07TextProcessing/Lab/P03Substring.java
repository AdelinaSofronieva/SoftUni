package F10TextProcessing.Lab;

import java.util.Scanner;

public class P03Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringToRemove = scanner.nextLine();
        String text = scanner.nextLine();

        int indexToRemoveFrom = text.indexOf(stringToRemove);

        while (indexToRemoveFrom >= 0) {
            text = text.replace(stringToRemove, "");

            indexToRemoveFrom = text.indexOf(stringToRemove);
        }

        System.out.println(text);
    }
}
