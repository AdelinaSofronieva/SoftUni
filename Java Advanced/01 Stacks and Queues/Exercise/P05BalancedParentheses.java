package J01StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P05BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<Character> firstHalfStack = new ArrayDeque<>();
        ArrayDeque<Character> secondHalfQueue = new ArrayDeque<>();

        boolean isBalanced = false;

        if (input.length() % 2 == 0) {
            for (int i = 0; i < input.length() / 2; i++) {
                char currentParentheses = input.charAt(i);
                firstHalfStack.push(currentParentheses);
            }

            for (int i = input.length() / 2; i < input.length(); i++) {
                char currentParentheses = input.charAt(i);
                secondHalfQueue.offer(currentParentheses);
            }

            for (int i = 0; i < firstHalfStack.size(); i++) {
                char currentStackElement = firstHalfStack.pop();
                char currentQueueElement = secondHalfQueue.pop();
                if (currentStackElement == '{' && currentQueueElement == '}') {
                    isBalanced = true;
                } else if (currentStackElement == '[' && currentQueueElement == ']') {
                    isBalanced = true;
                }else if (currentStackElement == '(' && currentQueueElement == ')') {
                    isBalanced = true;
                }
            }
        }

        if (isBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
