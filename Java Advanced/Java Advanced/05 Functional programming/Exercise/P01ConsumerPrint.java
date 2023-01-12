package J05FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputText = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .collect(Collectors.toList());

        inputText.forEach(name -> System.out.println(name));
    }
}
