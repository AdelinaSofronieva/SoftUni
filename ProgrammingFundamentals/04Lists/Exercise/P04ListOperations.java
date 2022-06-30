package F05Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String commands = scanner.nextLine();

        while (!commands.equals("End")) {
            List<String> commandLines = Arrays.stream(commands.split(" "))
                    .collect(Collectors.toList());
//•	Add {number} - add number at the end
//•	Insert {number} {index} - insert number at given index
//•	Remove {index} - remove that index
//•	Shift left {count} - first number becomes last 'count' times
//•	Shift right {count} - last number becomes first 'count' times
            String command = commandLines.get(0);
            int number = 0;
            int index = 0;
            int count = 0;

            switch (command) {
                case "Add":
                    number = Integer.parseInt(commandLines.get(1));
                    numbersList.add(number);
                    break;
                case "Insert":
                    number = Integer.parseInt(commandLines.get(1));
                    index = Integer.parseInt(commandLines.get(2));
                    if (index >= 0 && index < numbersList.size()) {
                        numbersList.add(index, number);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    index = Integer.parseInt(commandLines.get(1));
                    if (index >= 0 && index < numbersList.size()) {
                        numbersList.remove(index);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    String shiftLeftOrRight = commandLines.get(1);
                    count = Integer.parseInt(commandLines.get(2));

                    if (shiftLeftOrRight.equals("left")) {
                        for (int i = 1; i <= count; i++) {
                            int firstNum = numbersList.get(0);
                            numbersList.add(firstNum);
                            numbersList.remove(0);
                        }

                    } else {
                        for (int i = 1; i <= count; i++) {
                            int lastNum = numbersList.get(numbersList.size() - 1);
                            numbersList.add(0, lastNum);
                            numbersList.remove(numbersList.size() - 1);
                        }
                    }
                    break;
            }


                    commands = scanner.nextLine();
        }

        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
