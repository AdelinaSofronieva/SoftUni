package F05Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> peopleInWagonsList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacityOfEachWagon = Integer.parseInt(scanner.nextLine());

        String commands = scanner.nextLine();

        while (!commands.equals("end")) {
            List<String> commandList = Arrays.stream(commands.split(" "))
                    .collect(Collectors.toList());
            if (commandList.size() > 1) {
                //String currentCommand = commandList.get(0);
                int numPassengersToAdd = Integer.parseInt(commandList.get(1));
                peopleInWagonsList.add(numPassengersToAdd);

            } else {
                int numPassengersToAdd = Integer.parseInt(commandList.get(0));
                for (int i = 0; i < peopleInWagonsList.size(); i++) {
                    if (peopleInWagonsList.get(i) <= maxCapacityOfEachWagon &&
                            (numPassengersToAdd + peopleInWagonsList.get(i)) <= maxCapacityOfEachWagon) {
                        peopleInWagonsList.set(i, numPassengersToAdd + peopleInWagonsList.get(i));
                        break;
                    }
                }
            }


            commands = scanner.nextLine();
        }

        System.out.println(peopleInWagonsList.toString().replaceAll("[\\[\\],]", ""));
    }
}
