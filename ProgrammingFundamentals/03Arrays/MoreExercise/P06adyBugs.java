package F03Arrays.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P06adyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] initialIndexesArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String command = scanner.nextLine();

        String[] currentCommand = new String[3];


        int[] initialField = new int[fieldSize];
        for (int i = 0; i < initialIndexesArr.length; i++) {
            initialField[initialIndexesArr[i]] = 1;
        }

        while (!command.equals("end")) {
            currentCommand = command.split(" ");

            byte ladybugIndex = Byte.parseByte(currentCommand[0]);
            String direction = currentCommand[1];
            byte flyLength = Byte.parseByte(currentCommand[2]);

                initialField[ladybugIndex] = 0;

                if (direction.equals("left")) {
                    if (ladybugIndex - flyLength < 0) {
                        break;
                    } else {
                        if (initialField[ladybugIndex - flyLength] == 1) {
                            for (int i = ladybugIndex - flyLength - 1; i > 0; i-=flyLength) {
                                if ((initialField[i]) == 0) {
                                    (initialField[i]) = 1;
                                    break;
                                }
                            }
                        } else {
                            initialField[ladybugIndex - flyLength] = 1;
                        }
                    }
                } else {

                    if (ladybugIndex + flyLength > initialField.length - 1) {
                        break;
                    } else {
                        if (initialField[ladybugIndex + flyLength] == 1){
                            for (int i = ladybugIndex + flyLength + 1; i < initialField.length; i+=flyLength) {
                                if ((initialField[i]) == 0) {
                                    (initialField[i]) = 1;
                                    break;
                                }
                            }
                        } else {
                            initialField[ladybugIndex + flyLength] = 1;
                        }
                    }

                }

            command = scanner.nextLine();
        }

//        for (int item: initialField) {
//            System.out.print(item + " ");
//        }

        for (int i = 0; i < initialField.length; i++) {
            if (i!= initialField.length - 1) {
                System.out.print(initialField[i] + " ");
            }else {
                System.out.print(initialField[i]);
            }

        }

    }
}
