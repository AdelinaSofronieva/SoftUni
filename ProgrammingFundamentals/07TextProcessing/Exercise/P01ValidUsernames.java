package F10TextProcessing.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputText = scanner.nextLine().split(", ");
        List<String> validUserNamesList = new ArrayList<>();

        for (int i = 0; i < inputText.length; i++) {
            boolean isValidUsername = true;
            String currentUsername = inputText[i];

            if (currentUsername.length() < 3 || currentUsername.length() > 16) {
                isValidUsername = false;
            } else {
                for (int j = 0; j < currentUsername.length(); j++) {

                    char currentSymbol = currentUsername.charAt(j);
                    if (!Character.isDigit(currentSymbol) && !Character.isLetter(currentSymbol) &&
                            currentSymbol != '-' && currentSymbol != '_') {
                        isValidUsername = false;
                        break;
                    }
                }
            }
            if (isValidUsername) {
                validUserNamesList.add(currentUsername);
            }
        }

        System.out.println(String.join(System.lineSeparator(), validUserNamesList));
    }
}
