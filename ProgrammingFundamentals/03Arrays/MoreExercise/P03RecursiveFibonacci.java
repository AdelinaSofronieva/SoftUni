package F03Arrays.MoreExercise;

import java.util.Scanner;

public class P03RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wantedFibonacciNumber = Integer.parseInt(scanner.nextLine());

        int[] fibonacciNumArray = new int[wantedFibonacciNumber + 1];
        fibonacciNumArray[0] = 0;
        fibonacciNumArray[1] = 1;

        for (int i = 2; i <= wantedFibonacciNumber; i++) {
            fibonacciNumArray[i] = fibonacciNumArray[i-2] + fibonacciNumArray[i-1];
        }

        int fibonacciNum = fibonacciNumArray[fibonacciNumArray.length - 1];
        System.out.println(fibonacciNum);

    }
}
