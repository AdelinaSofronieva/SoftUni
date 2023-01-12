package J09IteratorsAndComparators.Exercise.P01ListyIterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputData = scanner.nextLine();
        ListyIterator listyIterator = null;

        while (!inputData.equals("END")) {
            String[] commandLine = inputData.split("\\s+");
            String command = commandLine[0];

            switch (command) {
                case "Create" :
                    if (commandLine.length > 1) {
//                        String[] data = new String[commandLine.length - 1];
//                        for (int i = 1; i < commandLine.length; i++) {
//                            data[i - 1] = commandLine[i];
//                        }
                        String[] data = Arrays.copyOfRange(commandLine, 1, commandLine.length);
                        listyIterator = new ListyIterator(data);
                    } else {
                        listyIterator = new ListyIterator();
                    }
                    break;
                case "HasNext" :
                    System.out.println(listyIterator.hasNext());
                    break;
                case "Move" :
                    System.out.println(listyIterator.move());
                    break;
                case "Print" :
                    try {
                        listyIterator.print();
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "PrintAll":
                    listyIterator.printAll();
                    break;
            }


            inputData = scanner.nextLine();
        }
    }
}
