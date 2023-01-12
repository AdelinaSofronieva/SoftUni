package J01StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P05PPrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String printCommand = scanner.nextLine();

        ArrayDeque<String> printCommandQueue = new ArrayDeque<>();

        while (!printCommand.equals("print")) {
            if (!printCommand.equals("cancel")) {
                printCommandQueue.offer(printCommand);
            } else {
                if (printCommandQueue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + printCommandQueue.peek());
                    printCommandQueue.poll();
                }
            }



            printCommand = scanner.nextLine();
        }

        while (!printCommandQueue.isEmpty()) {
            System.out.println(printCommandQueue.poll());
        }
//        for (String print: printCommandQueue) {
//            System.out.println(print);
//        }
    }
}
