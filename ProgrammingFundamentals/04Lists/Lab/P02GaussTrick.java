package F05Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sizeList = numbersList.size();

        for (int i = 0; i < sizeList / 2; i++) {
            int firstNum = numbersList.get(i);
            int lastNum = numbersList.get(numbersList.size() - 1);
            int sum = firstNum + lastNum;

            numbersList.set(i,sum);
            numbersList.remove(numbersList.size() - 1);
        }

        for (int num: numbersList) {
            System.out.print(num + " ");
        }
    }
}
