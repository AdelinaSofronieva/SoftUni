package J05FunctionalProgramming.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P03CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        Predicate<String> checkForUppercase = word -> Character.isUpperCase(word.charAt(0));
        List<String> wordsWithUpperCaseLetterList = Arrays.stream(input)
                        .filter(checkForUppercase)
                                .collect(Collectors.toList());

        System.out.println(wordsWithUpperCaseLetterList.size());
        wordsWithUpperCaseLetterList.forEach(word -> System.out.println(word));
    }
}
