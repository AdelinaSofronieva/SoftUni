package J01StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P03DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        ArrayDeque <Integer> binaryNumStack = new ArrayDeque<>();

        if (num == 0) {
            binaryNumStack.push(0);
        }
        while (num != 0) {
            int currentNum = num % 2;
            binaryNumStack.push(currentNum);
            num /= 2;
        }

        while (!binaryNumStack.isEmpty()) {
            System.out.print(binaryNumStack.pop());
        }
    }
}
