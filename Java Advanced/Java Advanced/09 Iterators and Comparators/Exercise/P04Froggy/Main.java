package J09IteratorsAndComparators.Exercise.P04Froggy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputData = scanner.nextLine();

        Integer[] numbers = Arrays.stream(inputData.split(", "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        Lake lake = new Lake(numbers);

        List<String> resultList = new ArrayList<>();

        for (Integer number : lake) {
            resultList.add(String.valueOf(number));
        }

        System.out.println(String.join(", ", resultList));
    }
}
