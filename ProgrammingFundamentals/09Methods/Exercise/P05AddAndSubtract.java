package F04Methods.Exercise;

import java.util.Scanner;

public class P05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int sum = sumNums(firstNum, secondNum);

        substractNums(sum, thirdNum);

    }

    public static int sumNums (int firstNum, int secondNum) {
        int sum = 0;
        sum = firstNum + secondNum;
        return sum;
    }

    public static void substractNums (int sum, int thirdNum) {
        System.out.print(sum - thirdNum);
    }
}
