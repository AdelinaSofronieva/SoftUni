package F04Methods.MoreExercise;

import java.util.Scanner;

public class P01DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();

        switch (inputText) {
            case "int":
                int intNum = Integer.parseInt(scanner.nextLine());
                System.out.println(printDataType(intNum));
                break;
            case "real":
                double doubleNum = Double.parseDouble(scanner.nextLine());
                System.out.printf("%.2f",printDataType(doubleNum));
                break;
            case "string":
                String text = scanner.nextLine();
                System.out.println(printDataType(text));
                break;
        }
    }

    public static int printDataType (int intNum) {
        int result = intNum * 2;

        return result;
    }

    public static double printDataType (double doubleNum) {
        double result = doubleNum * 1.5;

        return result;
    }

    public static String printDataType (String text) {
        String result = "$" + text + "$";

        return result;
    }
}
