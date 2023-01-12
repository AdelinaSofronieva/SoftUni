package J01StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P07SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> textStack = new ArrayDeque<>();
        String text = "";

        for (int i = 1; i <= n; i++) {
            String[] commands = scanner.nextLine().split("\\s+");
            String currentCommand = commands[0];

            switch (currentCommand) {
                case "1":
                    String textToPush = commands[1];
                        textStack.push(text);
                        text += textToPush;
                    break;
                case "2":
                    textStack.push(text);
                    int charsToErase = Integer.parseInt(commands[1]);
                    text = text.substring(0, text.length() - charsToErase);
                    break;
                case "3":
                    int indexToPrint = Integer.parseInt(commands[1]) - 1;
                    System.out.println(text.charAt(indexToPrint));

                    break;
                case "4":
                    text = textStack.pop();
                    break;
            }
        }
    }
}
