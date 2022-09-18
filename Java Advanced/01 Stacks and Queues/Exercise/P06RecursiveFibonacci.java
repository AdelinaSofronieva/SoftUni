package J01StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P06RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Long> fibonacciStack = new ArrayDeque<>();
        fibonacciStack.push(0l);
        fibonacciStack.push(1l);

        for (int i = 1; i <= n; i++) {
            long firstNum = fibonacciStack.pop();
            long secondNum = firstNum + fibonacciStack.pop();
            fibonacciStack.push(firstNum);
            fibonacciStack.push(secondNum);
        }

        System.out.println(fibonacciStack.peek());

    }
}
