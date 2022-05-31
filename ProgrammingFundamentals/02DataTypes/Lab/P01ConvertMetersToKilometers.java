package F02DataTypes.Lab;

import java.util.Scanner;

public class P01ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int metersDistance = Integer.parseInt(scanner.nextLine());

        double kmDistance = metersDistance / 1000.0;

        System.out.printf("%.2f", kmDistance);
    }
}
