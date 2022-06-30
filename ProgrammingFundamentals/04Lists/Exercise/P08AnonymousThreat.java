package F05Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .collect(Collectors.toList());

        String commands = scanner.nextLine();

        while (!commands.equals("3:1")) {

            String curentCommand = commands.split(" ")[0];
            if (curentCommand.equals("merge")) {

                int startIndex = Integer.parseInt(commands.split(" ")[1]);
                int endIndex = Integer.parseInt(commands.split(" ")[2]);

                if (startIndex < 0) {
                    startIndex = 0;
                }

                if (endIndex > input.size() - 1) {
                    endIndex = input.size() - 1;
                }

                boolean isValidIndexes = startIndex < endIndex;
                //boolean isValidIndexes = startIndex <= input.size() - 1 && endIndex >= 0 && startIndex < endIndex;

                if (isValidIndexes) {
                    String merged = "";
                    for (int i = startIndex; i <= endIndex; i++) {
                        String currentText = input.get(i);
                        merged += currentText;
                    }

                    for (int i = startIndex; i <= endIndex; i++) {
                        input.remove(startIndex);
                    }

                    input.add(startIndex, merged);
                }

            } else if (commands.contains("divide")) {
                int index = Integer.parseInt(commands.split(" ")[1]);
                int partitions = Integer.parseInt(commands.split(" ")[2]);

                String itemToDivide = input.get(index);
                int parts = (itemToDivide.length()) /partitions;
                input.remove(index);

                int currentIndex = 0;
                for (int i = 1; i < partitions; i++) {

                    String currentPart = itemToDivide.substring(currentIndex,currentIndex + parts);
                    input.add(index, currentPart);

                    currentIndex += parts;
                    index++;

                }
                input.add(index, itemToDivide.substring(currentIndex, itemToDivide.length()));
            }

            commands = scanner.nextLine();
        }

        System.out.println(String.join(" ", input));
    }
}
