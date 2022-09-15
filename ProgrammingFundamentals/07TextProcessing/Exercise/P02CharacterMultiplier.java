package F10TextProcessing.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        String firstString = inputLine.split("\\s+")[0];
        String secondString = inputLine.split("\\s+")[1];

        List<Integer> firstStringConvertedToIntList = putInList(firstString);
        List<Integer> secondStringConvertedToIntList = putInList(secondString);
        List<Integer> multipliedList = new ArrayList<>();

        for (int i = 0; i < firstStringConvertedToIntList.size(); i++) {
            int currentNum = firstStringConvertedToIntList.get(i);
            multipliedList.add(currentNum);
        }

        for (int i = 0; i < secondStringConvertedToIntList.size(); i++) {
            int currentNum = secondStringConvertedToIntList.get(i);
            if (i < firstStringConvertedToIntList.size()) {
                int multiplied = multipliedList.get(i) * currentNum;
                multipliedList.set(i, multiplied);
            } else {
                multipliedList.add(i, currentNum);
            }
        }

        int sum = multipliedList.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);
    }

    public static List<Integer> putInList (String currentString) {
        List<Integer> stringConvertedToIntList = new ArrayList<>();
        for (char currentSymbol: currentString.toCharArray()) {
            stringConvertedToIntList.add((int) currentSymbol);
        }

        return stringConvertedToIntList;
    }

    
}
