package F02DataTypes.Exercise;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int days = 0;
        int totalSpices = 0;

        while (startingYield >= 100) {
            int spices = startingYield - 26;
            startingYield -= 10;
            days++;
            totalSpices += spices;
        }

        if (totalSpices >= 26) {
            totalSpices -=26;
        }

        System.out.println(days);
        System.out.println(totalSpices);

    }
}
