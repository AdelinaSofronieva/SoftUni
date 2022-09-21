package F04Methods.Lab;

import java.util.Scanner;

public class P07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int countRepeatText = Integer.parseInt(scanner.nextLine());

        System.out.println(printRepetedText(countRepeatText, text));

    }

    public static String printRepetedText (int countRepeatText, String text) {
        String result = "";

        for (int i = 1; i <= countRepeatText; i++) {
            result += text;
        }

        return result;
    }
}
