package J05FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputNums = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String command = scanner.nextLine();
        while (!command.equals("end")) {

            switch (command) {
                case "add" :
                    inputNums = inputNums.stream()
                            .map(num -> num + 1)
                            .collect(Collectors.toList());
                    break;
                case "multiply" :
                    inputNums = inputNums.stream()
                            .map(num -> num  * 2)
                            .collect(Collectors.toList());
                    break;
                case "subtract" :
                    inputNums = inputNums.stream()
                            .map(num -> num - 1)
                            .collect(Collectors.toList());
                    break;
                case "print" :
                    inputNums.forEach(num -> System.out.print(num + " "));
                    System.out.println();
                    break;
            }


            command = scanner.nextLine();
        }
    }
}
