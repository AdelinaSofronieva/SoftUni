package J03SetsAndMapsAdvanced.Exercise;

import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P03PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> chemicalElementsSet = new TreeSet<>();
        for (int i = 1; i <= n; i++) {
            String[] currentCompound = scanner.nextLine().split("\\s+");
            Collections.addAll(chemicalElementsSet, currentCompound);
        }

        chemicalElementsSet.forEach(e -> System.out.print(e + " "));
    }
}
