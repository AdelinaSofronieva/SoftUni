package J03SetsAndMapsAdvanced.Exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P02SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] setsLength = scanner.nextLine().split("\\s+");
        int firstSetLength = Integer.parseInt(setsLength[0]);
        int secondSetLength = Integer.parseInt(setsLength[1]);

        Set<Integer> firstSet = new LinkedHashSet<>();
        for (int i = 1; i <= firstSetLength; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            firstSet.add(currentNum);
        }

        Set<Integer> secondSet = new LinkedHashSet<>();
        for (int i = 1; i <= secondSetLength; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            secondSet.add(currentNum);
        }

        firstSet.retainAll(secondSet);


        firstSet.forEach(e -> System.out.printf("%s ", e));
    }
}
