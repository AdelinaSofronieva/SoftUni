package F05Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            List<String> commandLine = Arrays.stream(command.split(" ")).collect(Collectors.toList());
            String currentCommand = commandLine.get(0);

            int number = 0;
            int index = 0;
            switch (currentCommand) {
                case "Add" :
                    number = Integer.parseInt(commandLine.get(1));
                    numbersList.add(number);
                    break;
                case "Remove" :
                    number = Integer.parseInt(commandLine.get(1));
                    numbersList.remove(Integer.valueOf(number));
                    break;
                case "RemoveAt" :
                    index = Integer.parseInt(commandLine.get(1));
                    numbersList.remove(index);
                    break;
                case "Insert" :
                    number = Integer.parseInt(commandLine.get(1));
                    index = Integer.parseInt(commandLine.get(2));
                    numbersList.add(index, number);
                    break;
            }

            command = scanner.nextLine();
        }

        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
