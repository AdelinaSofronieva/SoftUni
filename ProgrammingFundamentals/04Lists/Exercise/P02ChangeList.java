package F05Lists.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String commands = scanner.nextLine();

        while (!commands.equals("end")) {
            List<String> commandList = Arrays.stream(commands.split(" "))
                    .collect(Collectors.toList());
            String currentCommand = commandList.get(0);
            int element = Integer.parseInt(commandList.get(1));


            if (currentCommand.equals("Delete")) {
                List<Integer> needToRemove = new ArrayList<>();
                needToRemove.add(element);
                numbersList.removeAll(needToRemove);
            } else {
                int position = Integer.parseInt(commandList.get(2));
                numbersList.add(position, element);
            }

            commands = scanner.nextLine();
        }

        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
