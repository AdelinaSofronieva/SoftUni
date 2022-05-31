package F02DataTypes.Exercise;

import java.util.Scanner;

public class P01IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());
        int forthNum = Integer.parseInt(scanner.nextLine());

        int result = ((firstNum + secondNum) / thirdNum) * forthNum;

        System.out.println(result);

    }
}
