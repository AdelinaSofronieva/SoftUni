package F11RegularExpressions.MoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04SantasSecretHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        String decryptedMessage = scanner.nextLine();

        String regex = "@(?<name>[A-Za-z]+)[^@\\-!:>]*!(?<behaviour>[GN])!";
        Pattern pattern = Pattern.compile(regex);
        List<String> childNamesList = new ArrayList<>();

        while (!decryptedMessage.equals("end")) {
            StringBuilder encryptedMessage = new StringBuilder();

            for (char currentSymbol: decryptedMessage.toCharArray()) {
                char encryptSymbol = (char) (currentSymbol - key);
                encryptedMessage.append(encryptSymbol);
            }
            //System.out.println(encryptedMessage);
            Matcher matcher = pattern.matcher(encryptedMessage);
            while (matcher.find()) {
                String childName = matcher.group("name");
                String behaviour = matcher.group("behaviour");

                if (behaviour.equals("G")) {
                    childNamesList.add(childName);
                }
            }

            decryptedMessage = scanner.nextLine();
        }

        childNamesList.forEach(name -> System.out.println(name));
    }
}
