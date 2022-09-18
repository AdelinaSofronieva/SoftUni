package J01StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P03MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCommands = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> elementsStack = new ArrayDeque<>();

        for (int i = 1; i <= numCommands; i++) {
            String[] commands = scanner.nextLine().split("\\s+");
            String currentCommand = commands[0];

            switch (currentCommand) {
                case "1":
                    int currentNumToPush = Integer.parseInt(commands[1]);
                    elementsStack.push(currentNumToPush);
                    break;
                case "2":
                    elementsStack.pop();
                    break;
                case "3":
                    int max = elementsStack.stream().mapToInt(e -> e).max().getAsInt();
                    System.out.println(max);
                    break;
            }
        }
    }
}
