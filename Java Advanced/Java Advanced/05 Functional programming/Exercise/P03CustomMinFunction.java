package J05FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P03CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputNums = scanner.nextLine().split("\\s+");

        int  min = Arrays.stream(inputNums)
                .mapToInt(Integer::parseInt)
                .min().getAsInt();

        System.out.println(min);
    }
}
