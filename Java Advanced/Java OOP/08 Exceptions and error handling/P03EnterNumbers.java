package J08ExceptionsAndErrorHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03EnterNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = 1;
        int end = 100;

        List<Integer> numbersList = new ArrayList<>();

        while (numbersList.size() < 10) {
            try {
                start = readNumber(scanner, start, end, numbersList);

            } catch (Exception ex) {
                System.out.println("Invalid Number!");
                continue;
            }

        }

        System.out.println(numbersList.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", ")));
    }

    private static int readNumber(Scanner scanner, int start, int end, List<Integer> numbersList) {
        String currentValue = scanner.nextLine();
        int currentNum = Integer.parseInt(currentValue);

        if (currentNum > start && currentNum < end) {
            start = currentNum;
            addToList(start, numbersList);
        } else {
            System.out.printf("Your number is not in range %d - 100!%n", start);
        }

        return start;
    }

    private static void addToList(int start, List<Integer> numbersList) {
        numbersList.add(start);
    }
}
