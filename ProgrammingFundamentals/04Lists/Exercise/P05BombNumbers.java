package F05Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> powerList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(printSumOfDetonatedNums(numbersList, powerList));
    }

    public static int printSumOfDetonatedNums(List<Integer> numbersList, List<Integer> powerList) {
        int sum = 0;
        int specialBombNumber = powerList.get(0);
        int power = powerList.get(1);

        int countSpecialBombNumbers = 1;

        for (int currentCount = 1; currentCount <= countSpecialBombNumbers; currentCount++) {

            int findIndexOfSpecialBombNumber = numbersList.indexOf(specialBombNumber);
            int startIndex = findIndexOfSpecialBombNumber - power;
            if (startIndex < 0 && findIndexOfSpecialBombNumber > 0) {
                startIndex = 0;
            }

            if (startIndex >= 0) {
                for (int i = startIndex; i < findIndexOfSpecialBombNumber; i++) {
                    numbersList.remove(i);
                    i -= 1;
                    findIndexOfSpecialBombNumber = numbersList.indexOf(specialBombNumber);

                }
            }

            int endIndex = findIndexOfSpecialBombNumber + power;

            if (endIndex > numbersList.size() - 1) {
                endIndex = numbersList.size() - 1;
            }
            for (int i = findIndexOfSpecialBombNumber + 1; i <= endIndex; i++) {
                numbersList.remove(i);
                i -= 1;
                endIndex--;

            }

            findIndexOfSpecialBombNumber = numbersList.indexOf(specialBombNumber);
            numbersList.remove(findIndexOfSpecialBombNumber);

            if (numbersList.contains(specialBombNumber)) {
                countSpecialBombNumbers++;
            }
        }

        for (int num : numbersList) {
            sum += num;
        }
        // System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));

        return sum;
    }
}
