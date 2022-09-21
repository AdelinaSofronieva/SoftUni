package F04Methods.Lab;

import java.util.Scanner;

public class P06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());

        double result = calculateAndPrintArea(width, length);
        System.out.printf("%.0f", result);
    }

    public static double calculateAndPrintArea (double width, double length) {
        double result = width * length;

        return result;
    }
}
