package F01BasicSyntax.Lab;

import java.util.Scanner;

public class P12EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        boolean isOdd = false;

        if (num % 2 != 0) {
            isOdd = true;
        }

        while (isOdd) {
            System.out.println("Please write an even number.");
            num = Integer.parseInt(scanner.nextLine());

            if (num % 2 == 0) {
                break;
            }
        }
        num = Math.abs(num);
        System.out.printf("The number is: %d", num);
    }
}
