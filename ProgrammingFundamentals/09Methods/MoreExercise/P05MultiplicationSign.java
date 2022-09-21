package F04Methods.MoreExercise;

import java.util.Scanner;

public class P05MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int[] numArray = new int[]{
                firstNum, secondNum, thirdNum
        };

        printMltiplicationSign(numArray);
    }

    public static void printMltiplicationSign(int[] numArray) {
        int countNegativeSign = 0;
        boolean isZero = false;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] < 0) {
                countNegativeSign++;
            } else if (numArray[i] == 0) {
                countNegativeSign = 0;
                isZero = true;
                break;
            }

        }
        if (countNegativeSign == 1 || countNegativeSign == 3) {
            System.out.println("negative");
        } else if (isZero) {
            System.out.println("zero");
        } else
            System.out.println("positive");
    }
}

