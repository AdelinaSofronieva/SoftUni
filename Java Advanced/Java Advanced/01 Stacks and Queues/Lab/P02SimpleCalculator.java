package J01StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P02SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<Integer> numStack = new ArrayDeque<>();

        String[] inputElements = input.split("\\s+");

        String operation = null;
        for (int i = 0; i < inputElements.length; i++) {
            if (i == 0) {
                numStack.push(Integer.parseInt(inputElements[i]));
            } else if (inputElements[i].equals("+")) {
                operation = "+";
            } else if (inputElements[i].equals("-")) {
                operation = "-";
            } else {
                int previousNum = numStack.peek();
                int currentNum = Integer.parseInt(inputElements[i]);

                if (operation.equals("+")) {
                    currentNum += previousNum;
                } else {
                    currentNum = previousNum - currentNum;
                }

                numStack.pop();
                numStack.push(currentNum);

            }
        }

        for (Integer integer : numStack) {

            System.out.println(integer);

        }
    }
}
