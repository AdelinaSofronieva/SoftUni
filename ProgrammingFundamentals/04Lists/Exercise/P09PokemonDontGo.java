package F05Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine()
        .split(" "))
        .map(Integer::parseInt)
        .collect(Collectors.toList());

        int sumRemovedElements = 0;
        while (!numbersList.isEmpty()) {
            int index = Integer.parseInt(scanner.nextLine());
            int firstElement = numbersList.get(0);
            int lastElement = numbersList.get(numbersList.size() - 1);

            int currentValueToRemove = 0;
            if (index < 0) {
                currentValueToRemove = firstElement;
                numbersList.set(0, lastElement);
               // sumRemovedElements += firstElement;
            } else if (index > numbersList.size() - 1) {
                currentValueToRemove = lastElement;
                numbersList.set(numbersList.size() - 1, firstElement);
               // sumRemovedElements += lastElement;
            }else if (index >= 0 && index < numbersList.size()) {
                currentValueToRemove = numbersList.get(index);
                numbersList.remove(index);
            }

                sumRemovedElements += currentValueToRemove;

                for (int i = 0; i < numbersList.size(); i++) {
                    if (numbersList.get(i) <= currentValueToRemove) {
                        int currentIncreasedValue = numbersList.get(i) + currentValueToRemove;
                        numbersList.set(i, currentIncreasedValue);
                    } else {
                        int currentDecreasedValue = numbersList.get(i) - currentValueToRemove;
                        numbersList.set(i, currentDecreasedValue);
                    }

                }


            //index = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(sumRemovedElements);
    }
}
