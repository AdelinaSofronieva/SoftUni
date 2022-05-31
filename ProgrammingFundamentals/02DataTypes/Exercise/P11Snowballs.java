package F02DataTypes.Exercise;

import java.util.Scanner;

public class P11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double maxSnowballValue = Double.MIN_VALUE;
        int maxSnowballSnow = 0;
        int maxSnowballTime = 0;
        int maxSnowballQuality = 0;

        for (int i = 1; i <= n; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double currentSnowballValue = Math.pow((snowballSnow / snowballTime), snowballQuality);

            if (currentSnowballValue >= maxSnowballValue) {
                maxSnowballValue = currentSnowballValue;
                maxSnowballSnow = snowballSnow;
                maxSnowballTime = snowballTime;
                maxSnowballQuality = snowballQuality;

            }
        }
        System.out.printf("%d : %d = %.0f (%d)",maxSnowballSnow, maxSnowballTime, maxSnowballValue, maxSnowballQuality);

    }
}
