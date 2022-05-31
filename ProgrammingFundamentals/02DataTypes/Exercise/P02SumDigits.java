package F02DataTypes.Exercise;

import java.util.Scanner;

public class P02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }

        System.out.println(sum);
    }
}
