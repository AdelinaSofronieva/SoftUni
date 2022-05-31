package F02DataTypes.Exercise;

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int waterTankCapacity = 255;
        int tankLiters = 0;

        for (int i = 1; i <= n; i++) {
            int currentLiters = Integer.parseInt(scanner.nextLine());

            if (currentLiters <= waterTankCapacity) {
                tankLiters += currentLiters;
                waterTankCapacity -= currentLiters;
            } else {
                System.out.println("Insufficient capacity!");
            }

        }

        System.out.println(tankLiters);
    }
}
