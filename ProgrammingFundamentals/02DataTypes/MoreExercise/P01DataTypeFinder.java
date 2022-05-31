package F02DataTypes.MoreEcercise;

import java.util.Scanner;

public class P01DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            boolean isInt = false;
            boolean isDouble = false;
            int countCommas = 0;

//            try {
//               int intValue = Integer.parseInt(input);
//            } catch (NumberFormatException e) {
//                isInt = false;
//            }

            for (int i = 0; i <= input.length() - 1; i++) {

                char currentSymbol = input.charAt(i);

                if (i == 0 && currentSymbol == '-' && input.length() > 1) {
                    isInt = true;
                } else if (currentSymbol == '0') {
                    isInt = true;
                } else if (currentSymbol == '1') {
                    isInt = true;
                } else if (currentSymbol == '2') {
                    isInt = true;
                } else if (currentSymbol == '3') {
                    isInt = true;
                } else if (currentSymbol == '4') {
                    isInt = true;
                } else if (currentSymbol == '5') {
                    isInt = true;
                } else if (currentSymbol == '6') {
                    isInt = true;
                } else if (currentSymbol == '7') {
                    isInt = true;
                } else if (currentSymbol == '8') {
                    isInt = true;
                } else if (currentSymbol == '9') {
                    isInt = true;
                } else {
                    isInt = false;
                    break;
                }
            }
            for (int i = 0; i <= input.length() - 1; i++) {

                char currentSymbol = input.charAt(i);

                if (i == 0 && currentSymbol == '-' && input.length() > 2) {
                    isDouble = true;
                } else if (currentSymbol == '0') {
                    isDouble = true;
                } else if (currentSymbol == '1') {
                    isDouble = true;
                } else if (currentSymbol == '2') {
                    isDouble = true;
                } else if (currentSymbol == '3') {
                    isDouble = true;
                } else if (currentSymbol == '4') {
                    isDouble = true;
                } else if (currentSymbol == '5') {
                    isDouble = true;
                } else if (currentSymbol == '6') {
                    isDouble = true;
                } else if (currentSymbol == '7') {
                    isDouble = true;
                } else if (currentSymbol == '8') {
                    isDouble = true;
                } else if (currentSymbol == '9') {
                    isDouble = true;
                } else if (currentSymbol == '.') {
                    countCommas++;
                    if (countCommas == 1) {
                        isDouble = true;
                    } else if (countCommas > 1) {
                        isDouble = false;
                        break;
                    }
                } else {
                    isDouble = false;
                    break;
                }

            }
            if (isInt && isDouble) {
                isDouble = false;
            }


//            try {
//                double doubleValue = Double.parseDouble(input);
//            } catch (NumberFormatException e) {
//                isDouble = false;
//            }

            if (isInt) {
                System.out.printf("%s is integer type%n", input);
            } else if (isDouble) {
                System.out.printf("%s is floating point type%n", input);
            } else if (input.length() == 1) {
                System.out.printf("%s is character type%n", input);
            } else if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
                System.out.printf("%s is boolean type%n", input);
            } else {
                System.out.printf("%s is string type%n", input);
            }

            input = scanner.nextLine();

        }
    }
}
