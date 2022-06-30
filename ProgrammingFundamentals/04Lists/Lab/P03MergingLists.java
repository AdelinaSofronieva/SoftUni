package F05Lists.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstNumberList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondNumberList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int minListsSize = Math.min(firstNumberList.size(), secondNumberList.size());
        List<Integer> mergedLists = new ArrayList<>();

        for (int i = 0; i < minListsSize; i++) {
            mergedLists.add(firstNumberList.get(i));
            mergedLists.add(secondNumberList.get(i));

        }

        if (firstNumberList.size() > secondNumberList.size()) {
            mergedLists.addAll(firstNumberList.subList(minListsSize, firstNumberList.size()));
        } else {
            mergedLists.addAll(secondNumberList.subList(minListsSize, secondNumberList.size()));
        }

        System.out.println(mergedLists.toString().replaceAll("[\\[\\],]", ""));


        System.out.println();
    }
}
