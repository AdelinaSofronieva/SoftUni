package F01BasicSyntax.MoreExercise;

import java.util.Scanner;

public class P01SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int largeNum = Integer.MIN_VALUE;
        int mediumNum = firstNum;
        int smallNum = Integer.MAX_VALUE;



            if (firstNum >= largeNum) {
                largeNum = firstNum;
            }
            if (secondNum >= largeNum) {
                largeNum = secondNum;
            }
            if (thirdNum >= largeNum){
                largeNum = thirdNum;
            }

            if (firstNum <= smallNum) {
                smallNum = firstNum;
            }
            if (secondNum <= smallNum) {
                smallNum = secondNum;
            }
            if (thirdNum <= smallNum){
                smallNum = thirdNum;
            }

            if ((largeNum == firstNum) && (smallNum == secondNum)) {
                mediumNum = thirdNum;
            } else if ((largeNum == firstNum) && smallNum == thirdNum) {
                mediumNum = secondNum;
            } else if ((largeNum == secondNum) && (smallNum == firstNum)) {
                mediumNum = thirdNum;
            } else if ((largeNum == secondNum) && (smallNum == thirdNum)) {
                mediumNum = firstNum;
            } else if ((largeNum == thirdNum) && (smallNum == firstNum)) {
                mediumNum = secondNum;
            } else {
                mediumNum = firstNum;
            }

        System.out.println(largeNum);
        System.out.println(mediumNum);
        System.out.println(smallNum);

    }
}
