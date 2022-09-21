package F01BasicSyntax.Lab;

import java.util.Scanner;

public class P04BackIn30Minutes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int iniHour = Integer.parseInt(scanner.nextLine());
        int iniMinute = Integer.parseInt(scanner.nextLine());

        int allMinutes = (iniHour * 60) + iniMinute + 30;

        int hour = allMinutes / 60;
        int min = allMinutes % 60;

        if (hour > 23) {
            hour = 0;
        }

        System.out.printf("%d:%02d", hour, min);
    }
}
