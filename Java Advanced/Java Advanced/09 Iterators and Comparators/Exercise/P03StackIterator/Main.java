package J09IteratorsAndComparators.Exercise.P03StackIterator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

       CustomStackNew customStackNew = new CustomStackNew();

        while (!input.equals("END")) {
            String[] commandParts = input.split("\\s+");
            String command = commandParts[0];

            switch (command) {
                case "Push":
                    for (int i = 1; i < commandParts.length; i++) {
                        String currentStringElement = commandParts[i];
                        currentStringElement = currentStringElement.replace(",", "");
                        int currentElement = Integer.parseInt(currentStringElement);
                        customStackNew.push(currentElement);
                    }
                    break;
                case "Pop" :
                    if (customStackNew.getSize() == 0) {
                        System.out.println("No elements");
                        return;
                    }
                    customStackNew.pop();
                    break;
            }

            input = scanner.nextLine();

        }
        ArrayDeque<Integer> stack = new ArrayDeque<>();


        for (Integer integer : customStackNew) {
            stack.push(integer);
        }

        stack.forEach(System.out::println);
        stack.forEach(System.out::println);
    }
}
