package J01StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P01BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> historyStack = new ArrayDeque<>();

        while (!input.equals("Home")) {

            if (!input.equals("back")) {
                historyStack.push(input);
                System.out.println(input);
            } else {
                if (historyStack.size() < 2) {
                    System.out.println("no previous URLs");
                } else {
                    historyStack.pop();
                    System.out.println(historyStack.peek());
                }
            }

            input = scanner.nextLine();
        }
    }
}
