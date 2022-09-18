package J01StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P08BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> historyStack = new ArrayDeque<>();
        ArrayDeque<String> forwardQueue = new ArrayDeque<>();

        while (!input.equals("Home")) {

            if (!input.equals("back") && !input.equals("forward")) {
                historyStack.push(input);;
                System.out.println(input);
                forwardQueue.clear();
            } else if (input.equals("back")) {
                if (historyStack.size() < 2) {
                    System.out.println("no previous URLs");
                } else {
                    String currentURL = historyStack.pop();
                    System.out.println(historyStack.peek());
                    forwardQueue.offer(currentURL);
                }

            } else if (input.equals("forward")) {
                if (forwardQueue.isEmpty()) {
                    System.out.println("no next URLs");
                } else {
                    String currentForward = forwardQueue.poll();
                    System.out.println(currentForward);
                    historyStack.push(currentForward);
                }
            }

            input = scanner.nextLine();
        }
    }
}
