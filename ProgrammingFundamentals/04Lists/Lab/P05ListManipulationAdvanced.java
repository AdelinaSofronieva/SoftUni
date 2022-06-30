package F05Lists.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            List<String> commandList = Arrays.stream(command.split(" "))
                    .collect(Collectors.toList());
            String currentCommand = commandList.get(0);

            switch (currentCommand) {
                case "Contains" :
                    int currentNumber = Integer.parseInt(commandList.get(1));

                    if (numbersList.contains(currentNumber)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print" :
                    String evenOrOdd = commandList.get(1);
                    if (evenOrOdd.equals("even")) {
                        List<Integer> evenNumbers = new ArrayList<>();
                        for (int currentNum: numbersList) {
                            if (currentNum % 2 == 0) {
                                evenNumbers.add(currentNum);
                            }
                        }

                        System.out.println(evenNumbers.toString().replaceAll("[\\[\\],]", ""));
                    } else {
                        List<Integer> oddNumbers = new ArrayList<>();
                        for (int currentNum: numbersList) {
                            if (currentNum % 2 == 1) {
                                oddNumbers.add(currentNum);
                            }
                        }

                        System.out.println(oddNumbers.toString().replaceAll("[\\[\\],]", ""));
                    }
                    break;
                case "Get" :
                    int sum = numbersList.stream().mapToInt(Integer::intValue).sum();
                    System.out.println(sum);
                    break;
                case "Filter" :
                    //'<', '>', ">=", "<="
                    String currentCondition = commandList.get(1);
                    int currentConditionNum = Integer.parseInt(commandList.get(2));
                    List<Integer> condtionNumberList = new ArrayList<>();
                    if (currentCondition.equals("<")) {
                        condtionNumberList = numbersList.stream()
                                .filter(val -> val.intValue() < currentConditionNum)
                                .collect(Collectors.toList());

                    } else if (currentCondition.equals(">")) {
                        condtionNumberList = numbersList.stream()
                                .filter(val -> val.intValue() > currentConditionNum)
                                .collect(Collectors.toList());

                    } else if (currentCondition.equals(">=")) {
                        condtionNumberList = numbersList.stream()
                                .filter(val -> val.intValue() >= currentConditionNum)
                                .collect(Collectors.toList());

                    }else if (currentCondition.equals("<=")) {
                        condtionNumberList = numbersList.stream()
                                .filter(val -> val.intValue() <= currentConditionNum)
                                .collect(Collectors.toList());

                    }
                    System.out.println(condtionNumberList.toString().replaceAll("[\\[\\],]", ""));
                    break;
            }

            command = scanner.nextLine();
        }
    }

//    public static void printContainsNumber (int currentNumber, List<Integer> numbersList) {
//        boolean iSContainedNumber = false;
//
//    }
}
