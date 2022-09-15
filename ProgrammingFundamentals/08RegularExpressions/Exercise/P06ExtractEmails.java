package F11RegularExpressions.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P06ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        String regex = "[A-Za-z]+[.-]?[A-Za-z]*@[A-Za-z-]+(\\.[A-Za-z-]+)+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputLine);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
