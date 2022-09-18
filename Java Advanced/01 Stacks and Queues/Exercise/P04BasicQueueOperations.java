package J01StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P04BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] operationNumbersArr = scanner.nextLine().split("\\s+");

        int numElementsToOffer = Integer.parseInt(operationNumbersArr[0]);
        int numElementsToPoll = Integer.parseInt(operationNumbersArr[1]);
        int numToCheckIfPresentInStack = Integer.parseInt(operationNumbersArr[2]);

        ArrayDeque<Integer> numQueue = new ArrayDeque<>();
        String[] numsToPushArr = scanner.nextLine().split("\\s+");

        for (int i = 0; i < numElementsToOffer; i++) {
            int currentNumToOffer = Integer.parseInt(numsToPushArr[i]);
            numQueue.offer(currentNumToOffer);
        }

        for (int i = 0; i < numElementsToPoll; i++) {
            numQueue.poll();
        }

        if (numQueue.isEmpty()) {
            System.out.println(0);
        } else if (numQueue.contains(numToCheckIfPresentInStack)) {
            System.out.println("true");
        } else {
            //System.out.println(Collections.min(numStack));
            int min = numQueue.stream()
                    .mapToInt(Integer::intValue)
                    .min().getAsInt();
            System.out.println(min);
        }
    }
}
