package F02DataTypes.MoreEcercise;

import java.util.Scanner;

public class P02FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num; i++) {

            double leftNum = Double.parseDouble(scanner.next());
            double rightNum = Double.parseDouble(scanner.next());

            int sum = 0;
            if (leftNum > rightNum) {
                leftNum = Math.abs(leftNum);
                while (leftNum > 0) {
                    double currentDidit = leftNum % 10;
                    sum += currentDidit;
                    leftNum /= 10;
                }
                System.out.println(sum);
            } else {
                rightNum = Math.abs(rightNum);
                while (rightNum > 0) {
                    double currentDidit = rightNum % 10;
                    sum += currentDidit;
                    rightNum /= 10;
                }
                System.out.println(Math.abs(sum));
            }

        }
    }
}
