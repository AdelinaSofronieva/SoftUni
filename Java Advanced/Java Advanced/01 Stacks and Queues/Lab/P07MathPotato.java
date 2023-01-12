package J01StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class P07MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String kidsNames = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        String[] allKids = kidsNames.split("\\s+");
        ArrayDeque<String> kidsQueue = new ArrayDeque<>();
        Collections.addAll(kidsQueue, allKids);

        while (kidsQueue.size() > 1) {
            for (int i = 1; i < n; i++) {
                kidsQueue.offer(kidsQueue.poll());
            }
            System.out.println("Removed " + kidsQueue.poll());
        }
        System.out.println("Last is " + kidsQueue.poll());
    }
}
