package J01StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P01ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int[] numArr = Arrays
                .stream(input.split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayDeque<Integer> numbersStack = new ArrayDeque<>();

        for (int num: numArr) {
            numbersStack.push(num);
        }

        while (!numbersStack.isEmpty()) {
            System.out.printf("%s ", numbersStack.pop());
        }


    }
}
