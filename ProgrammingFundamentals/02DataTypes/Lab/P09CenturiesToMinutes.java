package F02DataTypes.Lab;

import java.util.Scanner;

public class P09CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte senturies = Byte.parseByte(scanner.nextLine());

        int years = senturies * 100;
        double days = years * 365.2422;
        double hours = days * 24;
        double minutes = hours * 60;

        System.out.printf("%d centuries = %d years = %.0f days = %.0f hours = %.0f minutes", senturies, years, days, hours,minutes);


    }
}
