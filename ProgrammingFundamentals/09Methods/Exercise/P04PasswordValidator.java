package F04Methods.Exercise;

import java.util.Scanner;

import static java.lang.Character.isDigit;

public class P04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        checkIsValidPassword(password);
    }

    public static void checkIsValidPassword(String password) {

        boolean isValidLength = ckeckForValidLength(password);
        boolean isValidLeterAndDigit= isOnlyLetterAndDigit(password);
        boolean isValidAtLeastTwoDigits= checkIfHasAtLeastTwoDigits(password);

        if (isValidLength && isValidLeterAndDigit && isValidAtLeastTwoDigits) {
            System.out.println("Password is valid");
        }
    }

    public static boolean ckeckForValidLength(String password) {
        boolean isvalid = true;

        if (password.length() < 6 || password.length() > 10) {
            System.out.println("Password must be between 6 and 10 characters");
            isvalid = false;
        }
        return isvalid;
    }

    public static boolean isOnlyLetterAndDigit(String password) {
        boolean isvalid = true;

        for (int i = 0; i < password.length(); i++) {
            char curentSymbol = password.charAt(i);

            if (!(curentSymbol >= 'a' && curentSymbol <= 'z') &&
                    !(curentSymbol >= 'A' && curentSymbol <= 'Z') &
                            !(curentSymbol >= '0' && curentSymbol <= '9')) {

                System.out.println("Password must consist only of letters and digits");
                isvalid = false;
                break;
            }
        }
        return isvalid;
    }

    public static boolean checkIfHasAtLeastTwoDigits(String password) {
        boolean isvalid = true;
        int countDigits = 0;

        for (int i = 0; i < password.length(); i++) {
            char curentSymbol = password.charAt(i);

            if (curentSymbol >= '0' && curentSymbol <= '9') {
                countDigits++;
            }
        }

        if (countDigits < 2) {
            System.out.println("Password must have at least 2 digits");
            isvalid = false;
        }

        return isvalid;
    }

}
