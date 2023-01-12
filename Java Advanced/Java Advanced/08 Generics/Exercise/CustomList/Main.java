package J08Generics.Exercise.CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        CustomList<String> customList = new CustomList<>();

        while (!inputLine.equals("END")) {
            String[] commands = inputLine.split("\\s+");
            String command = commands[0];

            switch (command) {
                case "Add":
                    String elementToAdd = commands[1];
                    customList.add(elementToAdd);
                    break;
                case "Remove":
                    int indexToRemove = Integer.parseInt(commands[1]);
                    customList.remove(indexToRemove);
                    break;
                case "Contains":
                    String elementToSearch = commands[1];
                    System.out.println(customList.contains(elementToSearch));
                    break;
                case "Swap":
                    int firstIndex = Integer.parseInt(commands[1]);
                    int secondIndex = Integer.parseInt(commands[2]);
                    customList.swap(firstIndex,secondIndex);
                    break;
                case "Greater":
                    String elementToCompareWith = commands[1];
                    System.out.println(customList.countGreaterThan(elementToCompareWith));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Sort":
                    Sorter.sort(customList);
                    break;
                case "Print":
                    System.out.println(customList);
                    break;
            }

            inputLine = scanner.nextLine();
        }
    }
}
