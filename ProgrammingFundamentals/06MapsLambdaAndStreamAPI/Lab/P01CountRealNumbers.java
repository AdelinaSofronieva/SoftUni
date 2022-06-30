package F09MapsLambdaAndStreamAPI.Lab;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numArr = Arrays
        .stream(scanner.nextLine().split(" "))
        .mapToDouble(Double::parseDouble)
        .toArray();

        TreeMap<Double, Integer> countNumsMap = new TreeMap<>();

        for (int i = 0; i < numArr.length; i++) {
            double currentNum = numArr[i];

            if (countNumsMap.containsKey(currentNum)) {
                countNumsMap.put(currentNum, countNumsMap.get(currentNum) + 1);
            } else {
                countNumsMap.put(currentNum, 1);
            }
        }

        for (Map.Entry<Double, Integer> entry : countNumsMap.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
