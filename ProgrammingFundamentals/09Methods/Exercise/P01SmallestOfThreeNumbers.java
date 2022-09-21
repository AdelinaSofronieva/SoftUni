package F04Methods.Exercise;

import java.util.Scanner;

public class P01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        System.out.println(printSmallestOfTreeNums(firstNum, secondNum, thirdNum));
    }

    public static int printSmallestOfTreeNums(int firstNum, int secondNum, int thirdNum) {
        int smallestNum = 0;
        if (firstNum <= secondNum && firstNum <= thirdNum) {
            smallestNum = firstNum;
        } else if (secondNum <= firstNum && secondNum <= thirdNum) {
            smallestNum = secondNum;
        } else {
            smallestNum = thirdNum;
        }

        return smallestNum;
    }
}
