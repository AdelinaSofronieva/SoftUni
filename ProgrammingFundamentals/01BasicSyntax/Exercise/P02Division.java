package F01BasicSyntax.Exercise;

import java.util.Scanner;

public class P02Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int division = 0;
        boolean isDevisible = false;

        if (num % 10 == 0) {
            division = 10;
            isDevisible = true;
        } else if (num % 7 == 0) {
            division = 7;
            isDevisible = true;
        } else if (num % 6 == 0) {
            division = 6;
            isDevisible = true;
        } else if (num % 3 == 0) {
            division = 3;
            isDevisible = true;
        } else if (num % 2 == 0) {
            division = 2;
            isDevisible = true;
        } else {
            System.out.println("Not divisible");
        }
        if (isDevisible) {
            System.out.printf("The number is divisible by %d", division);
        }
    }
}
