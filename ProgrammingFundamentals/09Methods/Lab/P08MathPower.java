package F04Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        double result = printAndCalculateNumPower(num, power);

        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(result));

    }

    public static Double printAndCalculateNumPower (double num, int power) {
        double result = 1;

        for (int i = 1; i <= power; i++) {
            result *= num;
        }

        return result;
    }
}
