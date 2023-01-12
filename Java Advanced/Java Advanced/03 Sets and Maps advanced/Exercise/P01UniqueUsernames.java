package J03SetsAndMapsAdvanced.Exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P01UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> usernamesSet = new LinkedHashSet<>();

        for (int i = 1; i <= n; i++) {
            String currentUsername = scanner.nextLine();
            usernamesSet.add(currentUsername);
        }

        usernamesSet.forEach(System.out::println);
    }
}
