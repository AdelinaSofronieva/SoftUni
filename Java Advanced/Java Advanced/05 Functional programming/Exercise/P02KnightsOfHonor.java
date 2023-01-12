package J05FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class P02KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputText = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .collect(Collectors.toList());

        Consumer<String> knightsPrinter = name -> System.out.println("Sir " + name);

        inputText.forEach(knightsPrinter);
    }
}
