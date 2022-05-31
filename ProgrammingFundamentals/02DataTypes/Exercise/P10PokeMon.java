package F02DataTypes.Exercise;

import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int countPoke = 0;
        int startPower = power;
        while (power >= distance) {
            power -= distance;
            countPoke++;

            if (power == (startPower / 2.0 )) {
                if (exhaustionFactor > 0) {
                    power /= exhaustionFactor;
                }
            }

        }

        System.out.println(power);
        System.out.println(countPoke);

    }
}
