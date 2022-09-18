package J01StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class P02BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] operationNumbersArr = scanner.nextLine().split("\\s+");

        int numElementsToPush = Integer.parseInt(operationNumbersArr[0]);
        int numElementsToPop = Integer.parseInt(operationNumbersArr[1]);
        int numToCheckIfPresentInStack = Integer.parseInt(operationNumbersArr[2]);

        ArrayDeque<Integer> numStack = new ArrayDeque<>();
        String[] numsToPushArr = scanner.nextLine().split("\\s+");

        for (int i = 0; i < numElementsToPush; i++) {
            int currentElement = Integer.parseInt(numsToPushArr[i]);
            numStack.push(currentElement);
        }

        for (int i = 0; i < numElementsToPop; i++) {
            numStack.pop();
        }

        if (numStack.isEmpty()) {
            System.out.println(0);
        } else if (numStack.contains(numToCheckIfPresentInStack)) {
            System.out.println("true");
        } else {
            //System.out.println(Collections.min(numStack));
            int min = numStack.stream()
                    .min(Integer::compareTo).get();
            System.out.println(min);
        }

    }
}
